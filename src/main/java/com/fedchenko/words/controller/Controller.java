package com.fedchenko.words.controller;

import com.fedchenko.words.WordsRequest;
import com.fedchenko.words.WordsResponse;
import com.fedchenko.words.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    WordsService wordsRestfulService;

    @PostMapping("/words")
    public WordsResponse processWords(@RequestBody WordsRequest request) {
        List<String> list = wordsRestfulService.processWords(request.getWords());
        return new WordsResponse(list);
    }

    /*
    Request sample:

    {
      "words": [
        "horse",
        "eat",
        "friday"
      ]
    }

     */
}
