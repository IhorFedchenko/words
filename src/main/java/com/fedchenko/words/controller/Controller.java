package com.fedchenko.words.controller;

import com.fedchenko.words.WordsResponse;
import com.fedchenko.words.WordsRestfulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    WordsRestfulService wordsRestfulService;

    @PostMapping("/words")
    public WordsResponse postBody(@RequestBody String request) {
        wordsRestfulService.parseRequest(request);
        return wordsRestfulService.getResponse();
    }

}
