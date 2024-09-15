package org.example.entities;

import org.example.core.entities.Entity;

import java.util.List;

public class Course implements Entity {
    private int id;
    private String name;
    private String description;
    private Integer imageId;
    private Integer categoryId;
    private List<User> users;
    private List<Comment> comments;
    private List<Enrollment> enrollments;


    public Course() {
    }

    public Course(int id, String name, String description, Integer imageId, Integer categoryId, List<User> users, List<Comment> comments, List<Enrollment> enrollments) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageId = imageId;
        this.categoryId = categoryId;
        this.users = users;
        this.comments = comments;
        this.enrollments = enrollments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}
