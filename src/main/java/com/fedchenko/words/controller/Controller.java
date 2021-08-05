package com.fedchenko.words.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @PostMapping("/words")
    public String postBody(@RequestBody String request) {
//        TODO parse JSON and set with iterator to java object
//        TODO return Java object like as JSON

        return "";
    }

}
