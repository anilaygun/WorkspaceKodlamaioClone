package org.example.business;

import org.example.dataAccess.CourseDao;
import org.example.entities.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private CourseDao courseDao;

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll(null);
    }

    @Override
    public Course getById(int id) {
        return courseDao.get(course -> course.getId() == id);
    }

    @Override
    public void add(Course course) {
        courseDao.add(course);
        System.out.println("Kurs eklendi : " + course.getName());
    }

    @Override
    public void update(Course course) {

        courseDao.update(course);
        System.out.println("Kurs güncellendi : " + course.getName());
    }

    @Override
    public void delete(Course course) {

        courseDao.delete(course);
        System.out.println("Kurs silindi : " + course.getName());
    }
}
