package org.springmvc.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/test")
    public String getResponseFormList() {
        return "test";
    }

    // this will be return the welcome.jsp page when we visit the url
    @GetMapping("greet")
    public String welcome() {
        return "welcome";
    }
}
