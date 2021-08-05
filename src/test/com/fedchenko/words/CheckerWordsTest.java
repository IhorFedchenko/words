package com.fedchenko.words;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckerWordsTest {

    @Test
    public void testGetWords_exemple1() {
        CheckerWords checkerWords = new CheckerWords();
        List<String> words = new ArrayList<String>();
        words.add("fish");
        words.add("horse");
        words.add("egg");
        words.add("goose");
        words.add("eagle");
        checkerWords.setWords(words);
        assertEquals("[fish, horse, egg, goose, eagle]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple2() {
        CheckerWords checkerWords = new CheckerWords();
        List<String> words = new ArrayList<String>();
        words.add("fish");
        words.add("horse");
        words.add("snake");
        words.add("goose");
        words.add("eagle");
        checkerWords.setWords(words);
        assertEquals("[fish, horse]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple3() {
        CheckerWords checkerWords = new CheckerWords();
        List<String> words = new ArrayList<String>();
        words.add("fish");
        words.add("horse");
        words.add("");
        words.add("goose");
        words.add("eagle");
        checkerWords.setWords(words);
        assertEquals("[fish, horse]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple4() {
        CheckerWords checkerWords = new CheckerWords();
        List<String> words = new ArrayList<String>();
        words.add("");
        words.add("horse");
        words.add("");
        words.add("goose");
        words.add("eagle");
        checkerWords.setWords(words);
        assertEquals("[]", checkerWords.getWords().toString());
    }
}