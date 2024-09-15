package org.example.business;

import org.example.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll();

    Course getById(int id);

    void add(Course course);

    void update(Course course);

    void delete(Course course);
}
