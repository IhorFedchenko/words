package com.fedchenko.words;

import java.util.ArrayList;

public class WordsResponse {

    public ArrayList<String> words;


    public void setWords(ArrayList<String> input) {
        words.addAll(input);
    }
}
