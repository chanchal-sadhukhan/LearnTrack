package dev.chanchalsadhukhan.learntrack.repository;

import dev.chanchalsadhukhan.learntrack.entity.Student;
import java.util.ArrayList;

public class StudentRepository {
    private final ArrayList<Student> students = new ArrayList<>();

    public void add(Student s) { students.add(s); }

    public ArrayList<Student> getAll() { return students; }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}
