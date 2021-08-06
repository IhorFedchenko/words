package com.fedchenko.words.controller;

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
        String prefix = "{\"words\": ";
        String sufix = "}";
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
        jsonArray.clear();
        jsonArray.addAll(words.getWords());
        return prefix + jsonArray.toString() + sufix;
    }

}
