package com.fedchenko.words;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;

public class WordsRestfulService {

    private CheckerWords words;
    private JSONParser jsonParser;
    private JSONObject jsonObject;
    private JSONArray jsonArray;

    public WordsRestfulService() {
        words = new CheckerWords();
        jsonParser = new JSONParser();
        jsonObject = new JSONObject();
    }

    public void parseRequest(String request) {
        try {
            jsonObject = (JSONObject) jsonParser.parse(request);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jsonArray = (JSONArray) jsonObject.get("words");
        words.setWords(jsonArray);
    }

    public WordsResponse getResponse() {
        WordsResponse wordsResponse = new WordsResponse();
        wordsResponse.setWords(words.getWords());
        return wordsResponse;
    }

}
