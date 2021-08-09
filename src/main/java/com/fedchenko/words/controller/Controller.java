package com.fedchenko.words.controller;

import com.fedchenko.words.WordsRestfulService;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @PostMapping("/words")
    public String postBody(@RequestBody String request) {
        WordsRestfulService wordsRestfulService = new WordsRestfulService();
        wordsRestfulService.getRequest(request);
        return wordsRestfulService.getResponse();
    }

}
