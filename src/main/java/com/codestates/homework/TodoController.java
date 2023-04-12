package com.codestates.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("")
    public String todo() {
        return "To-do Application";
    }
}

