package com.fedchenko.words.controller;

import com.fedchenko.words.CheckerWords;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class Controller {
    @PostMapping("/words")
    public String postBody(@RequestBody String input) {

        return "hello " + input;
    }
}
