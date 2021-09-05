package org.springmvc.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springmvc.tutorial.service.DemoServiceImpl;

@Controller
public class HomeController {

    public final DemoServiceImpl demoService;

    @Autowired
    public HomeController(DemoServiceImpl demoService) {
        this.demoService=demoService;
    }

    @ResponseBody
    @GetMapping("/test")
    public String getResponseFormList() {
        return "test";
    }

    // this will be return the welcome.jsp page when we visit the url
    @GetMapping("greet")
    public String welcome(@RequestParam String user, Model model) {
        model.addAttribute("name",demoService.getHelloMessage(user));
        return "welcome";
    }
}
