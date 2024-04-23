package com.iaspire.iaspiretodo.controller;

import com.iaspire.iaspiretodo.entity.TodoEntity;
import com.iaspire.iaspiretodo.service.intr.TodoServiceIntr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoServiceIntr todoServiceIntr;

    @GetMapping(value = "/getTasks")
    public ResponseEntity getAllTodoTasks(){
       List<TodoEntity> listOfTodo= todoServiceIntr.getAllTodoTasks();
       return new ResponseEntity(listOfTodo, HttpStatus.OK);
    }


    @PostMapping(value = "/createTask")
    public ResponseEntity createTask(@RequestBody TodoEntity todoEntity){
        List<TodoEntity> listOfTodo= todoServiceIntr.createTodoTask(todoEntity);
        return new ResponseEntity(listOfTodo, HttpStatus.OK);
    }

    @PatchMapping(value = "/modifyTask{todoId}" )
    public ResponseEntity modifyTask(@PathVariable("todoId") Long todoId, @RequestBody TodoEntity todoEntity){
        List<TodoEntity> listOfTodo= todoServiceIntr.modifyTodoTask(todoEntity);
        return new ResponseEntity(listOfTodo, HttpStatus.OK);
    }


    @DeleteMapping(value = "/deleteTask")
    public ResponseEntity deleteTask(@RequestParam Long todoId){
        List<TodoEntity> listOfTodo= todoServiceIntr.deleteTask(todoId);
        return new ResponseEntity(listOfTodo, HttpStatus.OK);
    }
}
