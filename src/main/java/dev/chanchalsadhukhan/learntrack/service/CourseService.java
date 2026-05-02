package dev.chanchalsadhukhan.learntrack.service;

import dev.chanchalsadhukhan.learntrack.entity.Course;
import dev.chanchalsadhukhan.learntrack.exceptions.EntityNotFoundException;
import dev.chanchalsadhukhan.learntrack.repository.CourseRepository;

public class CourseService {
    private final CourseRepository repo = new CourseRepository();

    public void addCourse(Course c) { repo.add(c); }

    public void listCourses() {
        for (Course c : repo.getAll()) {
            System.out.println(
                    "ID: " + c.getId() +
                            " | Name: " + c.getCourseName() +
                            " | Active: " + c.isActive()
            );
        }
    }

    public Course getCourse(int id) throws EntityNotFoundException {
        Course c = repo.findById(id);
        if (c == null) throw new EntityNotFoundException("Course not found");
        return c;
    }

    public void activateCourse(int id) throws EntityNotFoundException {
        getCourse(id).setActive(true);
    }

    public void deactivateCourse(int id) throws EntityNotFoundException {
        getCourse(id).setActive(false);
    }
}