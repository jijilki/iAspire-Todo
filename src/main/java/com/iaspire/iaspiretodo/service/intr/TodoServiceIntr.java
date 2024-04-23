package com.iaspire.iaspiretodo.service.intr;

import com.iaspire.iaspiretodo.entity.TodoEntity;

import java.util.List;

public interface TodoServiceIntr {
    List<TodoEntity> getAllTodoTasks();
    List<TodoEntity> createTodoTask(TodoEntity todo);

    List<TodoEntity> modifyTodoTask(TodoEntity todo);

    List<TodoEntity> deleteTask(Long todoId);
}
