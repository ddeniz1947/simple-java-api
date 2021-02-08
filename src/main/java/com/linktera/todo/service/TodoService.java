package com.linktera.todo.service;

import com.linktera.todo.model.Todo;

import java.util.List;

public interface TodoService {
    Todo save(Todo todo);
    List<Todo> getTodoList();
    void removeById(long id);
}
