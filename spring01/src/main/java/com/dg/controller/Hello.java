package com.dg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(value = "/hello")
    public String hello()
    {
        String name = "sdfs";

        return name;
    }
}
