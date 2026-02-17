package com.bcnd.studentback.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Long id;
    private String fullName;
    private String course;

    public Student(Long id, String fullName, String course) {
        this.id = id;
        this.fullName = fullName;
        this.course = course;
    }
}
