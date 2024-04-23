package com.iaspire.iaspiretodo.service.intr;

import com.iaspire.iaspiretodo.entity.TodoEntity;
/*import com.iaspire.iaspiretodo.repo.TodoRepository;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoServiceIntr{

/*    @Autowired
    TodoRepository todoRepository;*/
    List<TodoEntity> listOfTodo = new ArrayList<>();

    //TodoEntity todo1 = new TodoEntity(111,"Buy Tomatoes", "Buy Tomatoes" , "jijilki@gmail.com" , new Date(),new Date(),false );


    @Override
    public List<TodoEntity> getAllTodoTasks() {
        return listOfTodo;
        //return todoRepository.findAll();
    }

    @Override
    public List<TodoEntity> createTodoTask(TodoEntity newTodo) {
        listOfTodo.add(newTodo);
        return listOfTodo;
       // TodoEntity savedTodo = todoRepository.save(newTodo);
       // return todoRepository.findAll();
    }

    @Override
    public List<TodoEntity> modifyTodoTask(TodoEntity todo) {
        //Java 8
        Optional<TodoEntity> first = listOfTodo.stream().filter(todoEntity -> todoEntity.getTodoId() == todo.getTodoId()).findFirst();
        if(first.isPresent()){
            //Naive implementation
            listOfTodo.remove(first.get());
            listOfTodo.add(todo);
        }
        return  listOfTodo;

       /* todoRepository.save(todo);
        return todoRepository.findAll();*/
    }

    @Override
    public List<TodoEntity> deleteTask(Long todoId) {

      /*  for(TodoEntity todo:listOfTodo){

         if(todo.getTodoId()==todoId){
             listOfTodo.remove(todo);
         }

        }*/

        //Java 8
        TodoEntity deleteEntity = listOfTodo.stream().filter(todoEntity -> todoEntity.getTodoId() == todoId).findFirst().get();
        listOfTodo.remove(deleteEntity);
        return  listOfTodo;

     /*   todoRepository.deleteById(todoId);
        return todoRepository.findAll();*/
    }


}
