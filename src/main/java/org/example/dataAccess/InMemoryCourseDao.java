package org.example.dataAccess;

import org.example.entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InMemoryCourseDao implements CourseDao {
    List<Course> _courses;

    public InMemoryCourseDao() {
        _courses = new ArrayList<Course>();
        _courses.add(new Course(1, "Java 101", "Java ile temel programlama", null, null, null, null, null));
        _courses.add(new Course(2, "Spring Boot", "Spring Boot ile Web Geliştirme", null, null, null, null, null));
    }

    @Override
    public List<Course> getAll(Predicate<Course> filter) {
        if (filter == null) {
            return _courses;
        }

        List<Course> filteredCourses = new ArrayList<>();
        for (Course course : _courses) {
            if (filter.test(course)) {
                filteredCourses.add(course);
            }
        }
        return filteredCourses;
    }

    @Override
    public Course get(Predicate<Course> filter) {
        for (Course course : _courses) {
            if (filter.test(course)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public void add(Course entity) {
        _courses.add(entity);
    }

    @Override
    public void update(Course entity) {
        for (int i = 0; i < _courses.size(); i++) {
            if (_courses.get(i).getId() == entity.getId()) {
                _courses.set(i, entity);
                return;
            }
        }
    }

    @Override
    public void delete(Course entity) {
        _courses.removeIf(course -> course.getId() == entity.getId());
    }
}
