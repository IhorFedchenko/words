package com.fedchenko.words;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CheckerWords {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        List<String> result = new ArrayList<>(words.subList(0, hitCounter()));

        return result;
    }

    public void setWord(String input) {
        words.add(input);
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
        int result = 1;
        for (int i = 0; i < words.size() - 1; i++) {
            try {
                if (getLastChar(words.get(i)).equals(getFirstChar(words.get(i + 1)))) {
                    result++;
                } else break;
            } catch (IndexOutOfBoundsException e) {
                return result;
            }
        }
        return result;
    }
}
