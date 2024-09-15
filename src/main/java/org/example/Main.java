package org.example;

import org.example.business.CourseManager;
import org.example.dataAccess.InMemoryCourseDao;
import org.example.entities.Course;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager(new InMemoryCourseDao());
        printCourses(courseManager);
        ////////////
        Course course3 = new Course(3, "C#", null, null, null, null, null, null);
        courseManager.add(course3);
        printCourses(courseManager);
        ////////////
        Course courseToUpdate = courseManager.getById(3);
        if (courseToUpdate != null) {
            courseToUpdate.setName("Advanced C#");
            courseManager.update(courseToUpdate);
        }
        printCourses(courseManager);
        ////////////
        courseManager.delete(courseManager.getById(2));
        printCourses(courseManager);

    }

    private static void printCourses(CourseManager courseManager) {
        System.out.println("--------------");
        List<Course> courses = courseManager.getAll();
        for (Course course : courses) {
            System.out.println("ID: " + course.getId() +
                    ", Name: " + course.getName() +
                    ", Description: " + course.getDescription());
        }
        System.out.println("--------------");
    }
}