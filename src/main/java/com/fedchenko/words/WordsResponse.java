package com.fedchenko.words;

import java.util.ArrayList;

public class WordsResponse {

    public ArrayList<String> words;

    public WordsResponse(){
        words = new ArrayList<>();
    }


    public void setWords(ArrayList<String> input) {
        words.addAll(input);
    }
}
