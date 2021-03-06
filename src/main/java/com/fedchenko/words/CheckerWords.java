package com.fedchenko.words;

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

    private int hitCounter() {
        int result = 1;
        for (int i = 0; i < words.size() - 1; i++) {
            try {
                if (words.get(i).endsWith(String.valueOf(words.get(i + 1).charAt(0)))) {
                    result++;
                } else break;
            } catch (IndexOutOfBoundsException e) {
                return result;
            }
        }
        return result;
    }
}
