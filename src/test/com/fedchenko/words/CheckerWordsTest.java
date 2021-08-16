package com.fedchenko.words;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckerWordsTest {

    @Test
    public void testGetWords_exemple1() {
        CheckerWords checkerWords = new CheckerWords();
        ArrayList<String> set = new ArrayList<String>();
        set.add("fish");
        set.add("horse");
        set.add("egg");
        set.add("goose");
        set.add("eagle");
        checkerWords.setWords(set);
        assertEquals("[fish, horse, egg, goose, eagle]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple2() {
        CheckerWords checkerWords = new CheckerWords();
        ArrayList<String> set = new ArrayList<String>();
        set.add("fish");
        set.add("horse");
        set.add("snake");
        set.add("goose");
        set.add("eagle");
        checkerWords.setWords(set);
        assertEquals("[fish, horse]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple3() {
        CheckerWords checkerWords = new CheckerWords();
        ArrayList<String> set = new ArrayList<String>();
        set.add("fish");
        set.add("horse");
        set.add("");
        set.add("goose");
        set.add("eagle");
        checkerWords.setWords(set);
        assertEquals("[fish, horse]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple4() {
        CheckerWords checkerWords = new CheckerWords();
        ArrayList<String> set = new ArrayList<String>();
        set.add("");
        set.add("horse");
        set.add("");
        set.add("goose");
        set.add("eagle");
        checkerWords.setWords(set);
        assertEquals("[]", checkerWords.getWords().toString());
    }
}
