package com.bcnd.studentback.Controller;

import com.bcnd.studentback.Entity.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Todo")
public class TodoController {
    Map<Long, Todo> todos = new HashMap<>();

    @GetMapping("/completed")
    public List<Todo> getCompleted() {
        return todos.values()
                .stream()
                .filter(Todo::isCompleted)
                .toList();
    }

}
