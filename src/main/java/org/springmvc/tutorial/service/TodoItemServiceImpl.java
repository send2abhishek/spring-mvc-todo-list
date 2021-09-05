package org.springmvc.tutorial.service;

import org.springframework.stereotype.Service;
import org.springmvc.tutorial.model.TodoData;
import org.springmvc.tutorial.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService{


    private static final TodoData todoData=new TodoData();


    @Override
    public void addItem(TodoItem todoItem) {
        todoData.addItem(todoItem);
    }

    @Override
    public void removeItem(int id) {
        todoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getTodoItem(id);
    }

    @Override
    public void updateItem(TodoItem todoItem) {
        todoData.updateItem(todoItem);
    }

    @Override
    public TodoData getData() {
        return todoData;
    }
}
