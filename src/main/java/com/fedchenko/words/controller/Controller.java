package com.fedchenko.words.controller;

import com.fedchenko.words.WordsRequest;
import com.fedchenko.words.WordsResponse;
import com.fedchenko.words.WordsRestfulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @Autowired
    WordsRestfulService wordsRestfulService;

    @PostMapping("/words")
    public WordsResponse processWords(@RequestBody WordsRequest request) {
        WordsResponse wordsResponse = new WordsResponse();
        wordsResponse.setWords((ArrayList<String>) request.getWords());
        wordsRestfulService.processWords();
    }
}
