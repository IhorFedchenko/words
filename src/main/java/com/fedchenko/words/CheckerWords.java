package com.fedchenko.words;

import java.util.List;

public class CheckerWords {

    private List<String> words;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    private String getFirstChar(String input) {
        String result = new String();
        return result.valueOf(input.charAt(0));
    }

    private String getLastChar(String input) {
        String result = new String();
        int size = input.length();
        return result.valueOf(input.charAt(size - 1));
    }

    private int hitCounter() {
        int result = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            if (getLastChar(words.get(i)).equals(getFirstChar(words.get(i + 1)))){
                result++;
            }else break;

        }
        return result;
    }
}
