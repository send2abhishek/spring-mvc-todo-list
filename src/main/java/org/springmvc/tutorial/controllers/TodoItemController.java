package org.springmvc.tutorial.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springmvc.tutorial.model.TodoData;
import org.springmvc.tutorial.model.TodoItem;
import org.springmvc.tutorial.service.TodoItemService;
import org.springmvc.tutorial.utils.AttributesNames;
import org.springmvc.tutorial.utils.Mappings;
import org.springmvc.tutorial.utils.ViewNames;

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {

    private final TodoItemService todoItemService;

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @ModelAttribute
    public TodoData todoData() {
        return todoItemService.getData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

    @GetMapping(Mappings.ADD_ITEM)
    public String addItem(Model model){

        TodoItem todoItem=new TodoItem("sixth item","this is the six items", LocalDate.now());
        model.addAttribute(AttributesNames.TODO_ITEM,todoItem);
        return ViewNames.ITEMS_PROCESS;
    }

    // this will call after submission of new item
    @PostMapping(Mappings.ADD_ITEM)
    public String postProcessor(@ModelAttribute(AttributesNames.TODO_ITEM) TodoItem todoItem) {

        log.info("todo item get from after user submission ={}", todoItem);
        todoItemService.addItem(todoItem);
        return "redirect:/" + Mappings.ITEMS;
    }

}
