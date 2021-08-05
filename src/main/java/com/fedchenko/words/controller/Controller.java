package com.fedchenko.words.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedchenko.words.CheckerWords;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
public class Controller {
    @PostMapping("/words")
    public String postBody(@RequestBody String request) {
//        TODO return Java object like as JSON
        CheckerWords words = new CheckerWords();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = new JSONObject();
        try {
             jsonObject =  (JSONObject) jsonParser.parse(request);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = (JSONArray) jsonObject.get("words");
        Iterator<String> iterator = jsonArray.iterator();
        while (iterator.hasNext()){
            words.setWord(iterator.next());
        }
        return words.getWords().toString();
    }

}
