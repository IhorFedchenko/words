package com.fedchenko.words.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedchenko.words.CheckerWords;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @PostMapping("/words")
    public String postBody(@RequestBody String input) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        CheckerWords words = mapper.readValue(input, CheckerWords.class);

        return "hello " + input;
    }
}
