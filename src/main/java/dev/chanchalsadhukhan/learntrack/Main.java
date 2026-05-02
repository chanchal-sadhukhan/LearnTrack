package dev.chanchalsadhukhan.learntrack;

import dev.chanchalsadhukhan.learntrack.entity.Course;
import dev.chanchalsadhukhan.learntrack.entity.Student;
import dev.chanchalsadhukhan.learntrack.enums.EnrollmentStatus;
import dev.chanchalsadhukhan.learntrack.service.CourseService;
import dev.chanchalsadhukhan.learntrack.service.EnrollmentService;
import dev.chanchalsadhukhan.learntrack.service.StudentService;
import dev.chanchalsadhukhan.learntrack.utils.IdGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService(studentService, courseService);

        while (true) {
            System.out.println("\n===== LearnTrack =====");

            System.out.println("1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Search Student");
            System.out.println("4 Deactivate Student");

            System.out.println("5 Add Course");
            System.out.println("6 View Courses");
            System.out.println("7 Activate Course");
            System.out.println("8 Deactivate Course");

            System.out.println("9 Enroll Student");
            System.out.println("10 View Enrollments");
            System.out.println("11 Update Enrollment");

            System.out.println("12 Exit");

            int ch = sc.nextInt();

            try {
                switch (ch) {

                    case 1:
                        System.out.print("First Name: ");
                        String fn = sc.next();

                        System.out.print("Last Name: ");
                        String ln = sc.next();

                        System.out.print("Email: ");
                        String email = sc.next();

                        System.out.print("Batch: ");
                        String batch = sc.next();

                        int studentId = IdGenerator.getNextStudentId();

                        studentService.addStudent(new Student(studentId, fn, ln, email, batch));

                        System.out.println("Student added! with ID " + studentId);
                        break;

                    case 2:
                        studentService.listStudents();
                        break;

                    case 3:
                        studentService.searchStudent(sc.nextInt());
                        break;

                    case 4:
                        studentService.deactivateStudent(sc.nextInt());
                        break;

                    case 5:
                        System.out.print("Course Name: ");
                        String cname = sc.next();

                        System.out.print("Description: ");
                        String desc = sc.next();

                        System.out.print("Duration (weeks): ");
                        int duration = sc.nextInt();

                        int courseId = IdGenerator.getNextCourseId();

                        courseService.addCourse(new Course(courseId, cname, desc, duration));

                        System.out.println("Course added! with ID " + courseId);
                        break;

                    case 6:
                        courseService.listCourses();
                        break;

                    case 7:
                        courseService.activateCourse(sc.nextInt());
                        break;

                    case 8:
                        courseService.deactivateCourse(sc.nextInt());
                        break;

                    case 9:
                        System.out.print("Enter Student ID: ");
                        int sid = sc.nextInt();

                        System.out.print("Enter Course ID: ");
                        int cid = sc.nextInt();

                        enrollmentService.enrollStudent(sid, cid);
                        break;

                    case 10:
                        enrollmentService.viewEnrollmentsByStudent(sc.nextInt());
                        break;

                    case 11:
                        System.out.print("Enrollment ID: ");
                        int eid = sc.nextInt();

                        System.out.println("1. Complete");
                        System.out.println("2. Cancel");
                        int choiceStatus = sc.nextInt();

                        EnrollmentStatus status =
                                (choiceStatus == 1)
                                        ? EnrollmentStatus.COMPLETED
                                        : EnrollmentStatus.CANCELLED;

                        enrollmentService.updateStatus(eid, status);

                        System.out.println("Status updated!");
                        break;

                    case 12:
                        System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
