package dev.chanchalsadhukhan.learntrack.repository;

import dev.chanchalsadhukhan.learntrack.entity.Enrollment;
import java.util.ArrayList;

public class EnrollmentRepository {
    private final ArrayList<Enrollment> enrollments = new ArrayList<>();

    public void add(Enrollment e) { enrollments.add(e); }

    public ArrayList<Enrollment> getAll() { return enrollments; }
}