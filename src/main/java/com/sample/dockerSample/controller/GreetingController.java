package com.sample.dockerSample.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maryam Rezaei
 * @since 1/18/2023
 */

@RestController
public class GreetingController {

    @GetMapping("/")
    public String index() {
        return "Hello Stranger!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        if (StringUtils.isNotEmpty(name)) {
            return "Hello " + StringUtils.trim(name) + "!";
        }
        return "Hello Stranger!";
    }

    @GetMapping("/author")
    public String author() {
        return "MarYaM Rezaei";
    }

}

