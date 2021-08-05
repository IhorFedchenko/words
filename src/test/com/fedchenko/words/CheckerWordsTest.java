package com.fedchenko.words;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckerWordsTest {

    @Test
    public void testGetWords_exemple1() {
        CheckerWords checkerWords = new CheckerWords();
        checkerWords.setWord("fish");
        checkerWords.setWord("horse");
        checkerWords.setWord("egg");
        checkerWords.setWord("goose");
        checkerWords.setWord("eagle");
        assertEquals("[fish, horse, egg, goose, eagle]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple2() {
        CheckerWords checkerWords = new CheckerWords();
        checkerWords.setWord("fish");
        checkerWords.setWord("horse");
        checkerWords.setWord("snake");
        checkerWords.setWord("goose");
        checkerWords.setWord("eagle");
        assertEquals("[fish, horse]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple3() {
        CheckerWords checkerWords = new CheckerWords();
        checkerWords.setWord("fish");
        checkerWords.setWord("horse");
        checkerWords.setWord("");
        checkerWords.setWord("goose");
        checkerWords.setWord("eagle");
        assertEquals("[fish, horse]", checkerWords.getWords().toString());
    }

    @Test
    public void testGetWords_exemple4() {
        CheckerWords checkerWords = new CheckerWords();
        checkerWords.setWord("");
        checkerWords.setWord("horse");
        checkerWords.setWord("");
        checkerWords.setWord("goose");
        checkerWords.setWord("eagle");
        assertEquals("[]", checkerWords.getWords().toString());
    }
}
