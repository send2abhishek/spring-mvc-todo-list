package org.springmvc.tutorial.service;

import org.springmvc.tutorial.model.TodoData;
import org.springmvc.tutorial.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem todoItem);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem todoItem);
    TodoData getData();

}
