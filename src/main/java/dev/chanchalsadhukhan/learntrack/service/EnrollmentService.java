package dev.chanchalsadhukhan.learntrack.service;

import dev.chanchalsadhukhan.learntrack.entity.Enrollment;
import dev.chanchalsadhukhan.learntrack.enums.EnrollmentStatus;
import dev.chanchalsadhukhan.learntrack.repository.EnrollmentRepository;
import dev.chanchalsadhukhan.learntrack.utils.IdGenerator;

public class EnrollmentService {

    private final EnrollmentRepository repo = new EnrollmentRepository();
    private final StudentService studentService;
    private final CourseService courseService;

    public EnrollmentService(StudentService studentService, CourseService courseService) {
        this.studentService = studentService;
        this.courseService = courseService;
    }

    public void enrollStudent(int studentId, int courseId) throws Exception {

        // Validate student
        var student = studentService.getStudent(studentId);
        if (!student.isActive()) {
            throw new Exception("Student is inactive");
        }

        // Validate course
        var course = courseService.getCourse(courseId);
        if (!course.isActive()) {
            throw new Exception("Course is inactive");
        }

        // Create enrollment with real date
        String date = java.time.LocalDate.now().toString();

        int enrollmentId = IdGenerator.getNextEnrollmentId();

        Enrollment e = new Enrollment(
                enrollmentId,
                studentId,
                courseId,
                date
        );

        repo.add(e);

        System.out.println("Student enrolled successfully! with ID " + enrollmentId);
    }

    public void viewEnrollmentsByStudent(int studentId) throws Exception {

        var student = studentService.getStudent(studentId);

        boolean found = false;

        for (Enrollment e : repo.getAll()) {
            if (e.getStudentId() == studentId) {

                var course = courseService.getCourse(e.getCourseId());

                System.out.println(
                        "EnrollmentID: " + e.getId() +
                                " | Student: " + student.getDisplayName() +
                                " | Course: " + course.getCourseName() +
                                " | Status: " + e.getStatus()
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No enrollments found");
        }
    }

    public void updateStatus(int enrollmentId, EnrollmentStatus status) {
        for (Enrollment e : repo.getAll()) {
            if (e.getId() == enrollmentId) {
                e.setStatus(status);
                return;
            }
        }
        System.out.println("Enrollment not found");
    }
}