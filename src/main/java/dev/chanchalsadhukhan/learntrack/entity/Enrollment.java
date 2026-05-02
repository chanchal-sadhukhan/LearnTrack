package dev.chanchalsadhukhan.learntrack.entity;

import dev.chanchalsadhukhan.learntrack.enums.EnrollmentStatus;

public class Enrollment {
    private final int id;
    private final int studentId;
    private final int courseId;
    private String enrollmentDate;
    private EnrollmentStatus status;

    public Enrollment(int id, int studentId, int courseId, String date) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = date;
        this.status = EnrollmentStatus.ACTIVE;
    }

    public int getId() { return id; }
    public int getStudentId() { return studentId; }
    public int getCourseId() { return courseId; }
    public EnrollmentStatus getStatus() { return status; }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }
}