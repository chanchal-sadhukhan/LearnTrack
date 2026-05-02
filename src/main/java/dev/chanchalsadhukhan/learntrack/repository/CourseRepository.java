package dev.chanchalsadhukhan.learntrack.repository;

import dev.chanchalsadhukhan.learntrack.entity.Course;
import java.util.ArrayList;

public class CourseRepository {
    private ArrayList<Course> courses = new ArrayList<>();

    public void add(Course c) { courses.add(c); }

    public ArrayList<Course> getAll() { return courses; }

    public Course findById(int id) {
        for (Course c : courses) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}
