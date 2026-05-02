package dev.chanchalsadhukhan.learntrack.service;

import dev.chanchalsadhukhan.learntrack.entity.Student;
import dev.chanchalsadhukhan.learntrack.exceptions.EntityNotFoundException;
import dev.chanchalsadhukhan.learntrack.repository.StudentRepository;

public class StudentService {
    private final StudentRepository repo = new StudentRepository();

    public void addStudent(Student s) { repo.add(s); }

    public void listStudents() {
        for (Student s : repo.getAll()) {
            System.out.println(
                    "ID: " + s.getId() + " | Name: " + s.getDisplayName() + " | Active: " + s.isActive()
            );
        }
    }

    public Student getStudent(int id) throws EntityNotFoundException {
        Student s = repo.findById(id);
        if (s == null) throw new EntityNotFoundException("Student not found");
        return s;
    }

    public void searchStudent(int id) throws EntityNotFoundException {
        Student s = getStudent(id);
        System.out.println("Found: " + s.getDisplayName());
    }

    public void deactivateStudent(int id) throws EntityNotFoundException {
        Student s = getStudent(id);
        s.setActive(false);
    }
}
