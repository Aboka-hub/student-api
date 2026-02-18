package com.bcnd.studentback.Service;

import com.bcnd.studentback.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {
    Map<Long,Student> students =new HashMap<>();
    private AtomicLong studentId = new AtomicLong();

    public Student create(Student student){
        Long id = studentId.incrementAndGet();
        student.setId(id);
        students.put(id, student);
        return student;
    }

    public List<Student> getByCourse(String course) {
        return students.values()
                .stream()
                .filter(s -> s.getCourse().equalsIgnoreCase(course))
                .toList();
    }
}
