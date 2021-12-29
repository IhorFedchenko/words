package com.fedchenko.words;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckerWordsTest {

    @Test
    public void testGetWords_exemple1() {
        WordsService checkerWords = new WordsService();
        ArrayList<String> set = new ArrayList<String>();
        set.add("fish");
        set.add("horse");
        set.add("egg");
        set.add("goose");
        set.add("eagle");
        List<String> result = checkerWords.processWords(set);
        assertEquals(Arrays.asList("fish", "horse", "egg", "goose", "eagle"), result);
    }

    @Test
    public void testGetWords_exemple2() {
        WordsService checkerWords = new WordsService();
        ArrayList<String> set = new ArrayList<String>();
        set.add("fish");
        set.add("horse");
        set.add("snake");
        set.add("goose");
        set.add("eagle");
        List<String> result = checkerWords.processWords(set);
        assertEquals(Arrays.asList("fish", "horse"), result);
    }

    @Test
    public void testGetWords_exemple3() {
        WordsService checkerWords = new WordsService();
        ArrayList<String> set = new ArrayList<String>();
        set.add("fish");
        set.add("horse");
        set.add("");
        set.add("goose");
        set.add("eagle");
        List<String> result = checkerWords.processWords(set);
        assertEquals(Arrays.asList("fish", "horse"), result);
    }

    @Test
    public void testGetWords_exemple4() {
        WordsService checkerWords = new WordsService();
        ArrayList<String> set = new ArrayList<String>();
        set.add("");
        set.add("horse");
        set.add("");
        set.add("goose");
        set.add("eagle");
        List<String> result = checkerWords.processWords(set);
        assertTrue(result.isEmpty());
    }
}
