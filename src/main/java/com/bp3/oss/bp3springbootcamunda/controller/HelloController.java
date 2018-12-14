package com.bp3.oss.bp3springbootcamunda.controller;

import com.bp3.oss.bp3springbootcamunda.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StartService startService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="World") String name) {
        return String.format("Hello, %s! Process 1 has been started for you. The instance id is %s",
                name,
                startService.startProcess1(name));
    }
}
