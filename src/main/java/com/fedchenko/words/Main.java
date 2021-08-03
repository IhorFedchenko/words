package com.fedchenko.words;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        CheckerWords anyObj = new CheckerWords();
        List<String> words = new ArrayList<String>();
        words.add("fish");
        words.add("horse");
        words.add("egg");
        words.add("goose");
        words.add("eagle");
        anyObj.setWords(words);

    }


}
