package com.fedchenko.words;

import java.util.List;


public class WordsResponse {

    public List<String> words;  // avoid using implementations, prefer interfaces, e.g. List over ArrayList

    public WordsResponse(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public WordsResponse setWords(List<String> words) {
        this.words = words;
        return this;
    }
}
