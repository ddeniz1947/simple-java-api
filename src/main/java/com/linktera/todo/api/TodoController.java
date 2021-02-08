package com.linktera.todo.api;


import com.linktera.todo.model.Todo;
import com.linktera.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("/")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
       return ResponseEntity.ok(todoService.save(todo));
    }

    @GetMapping("/list")
    public List<Todo> getList(){
        return todoService.getTodoList();
    }

    @RequestMapping(value = "/deleteMethod", method = RequestMethod.POST)
    public long upload(@RequestParam(value = "idItem", defaultValue = "") long id) {
        todoService.removeById(id);
        return id;
    }
}
