package com.fedchenko.words;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("fish");
        words.add("horse");
        words.add("egg");
        words.add("goose");
        words.add("eagle");

        for (int i = 0; i < words.size() - 1; i++) {
            System.out.println(lastChar(words.get(i)).equals(firstChar(words.get(i + 1))));

        }
    }

    public static String firstChar(String input) {
        String result = new String();
        return result.valueOf(input.charAt(0));
    }

    public static String lastChar(String input) {
        String result = new String();
        int size = input.length();
        return result.valueOf(input.charAt(size - 1));
    }
}
