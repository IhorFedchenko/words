package com.fedchenko.words;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;

public class WordsRestfulService {

    private CheckerWords words;
    private JSONParser jsonParser;
    private JSONObject jsonObject;
    private JSONArray jsonArray;

    private String sufix = "}";

    public WordsRestfulService() {
        words = new CheckerWords();
        jsonParser = new JSONParser();
        jsonObject = new JSONObject();
    }

    public void getRequest(String request) {
        try {
            jsonObject = (JSONObject) jsonParser.parse(request);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        jsonArray = (JSONArray) jsonObject.get("words");
    }

    private String getArrayName() {
        String arrayName = new String();
        String stringJSONObject = jsonObject.toJSONString();
        if (stringJSONObject.startsWith("{") && stringJSONObject.endsWith("}") && stringJSONObject.contains(":")) {
            int indexOf = stringJSONObject.indexOf(":");
            indexOf++;
            arrayName = stringJSONObject.substring(0, indexOf);
        }
        return arrayName;
    }

    public String getResponse() {
        Iterator<String> iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            words.setWord(iterator.next());
        }
        jsonArray.clear();
        jsonArray.addAll(words.getWords());
        return getArrayName() + jsonArray.toString() + sufix;
    }

}
