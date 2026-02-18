package com.bcnd.studentback.Controller;

import com.bcnd.studentback.Entity.Book;
import com.bcnd.studentback.Entity.Student;
import com.bcnd.studentback.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping("/by-course")
    public List<Student> getByCourse(@RequestParam String course) {
        return studentService.getByCourse(course);
    }
}
