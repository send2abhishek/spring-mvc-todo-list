package org.springmvc.tutorial.model;


import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    private static int idValue = 1;

    private final List<TodoItem> items = new ArrayList<>();

    public TodoData() {

        addItem(new TodoItem("first","this is the first details ", LocalDate.now()));
        addItem(new TodoItem("sec","this is the sec details ", LocalDate.now()));
        addItem(new TodoItem("third","this is the third details ", LocalDate.now()));
        addItem(new TodoItem("fourth","this is the fourth details ", LocalDate.now()));

    }

    public List<TodoItem> getItems() {

        return Collections.unmodifiableList(items);
    }

    public void addItem(TodoItem item) {

        if (item == null) {
            throw new NullPointerException("todo item can't be null");
        }
        item.setId(idValue);
        items.add(item);
        idValue++;
    }

    public void removeItem(int id) {

        ListIterator<TodoItem> listIterator = items.listIterator();

        while (listIterator.hasNext()) {

            TodoItem todoItem = listIterator.next();

            if (todoItem.getId() == id) {
                listIterator.remove();
                break;
            }
        }

    }

    public TodoItem getTodoItem(int id) {

        for (TodoItem todoItem : items) {

            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem todoItem) {

        ListIterator<TodoItem> listIterator = items.listIterator();

        while (listIterator.hasNext()) {

            TodoItem item = listIterator.next();

            if (item.equals(item)) {
                listIterator.set(todoItem);
                break;
            }
        }

    }
}
