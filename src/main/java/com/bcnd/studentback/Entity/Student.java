package com.bcnd.studentback.Entity;




public class Student {
    private Long id;
    private String fullName;
    private String course;

    public Student(Long id, String fullName, String course) {
        this.id = id;
        this.fullName = fullName;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
