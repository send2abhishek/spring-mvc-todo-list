package org.springmvc.tutorial.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public String getHelloMessage(String user) {
        return "Hello "+user;
    }

    @Override
    public String getWelcomeMessage() {
        return "welcome to the this demo application";
    }
}
