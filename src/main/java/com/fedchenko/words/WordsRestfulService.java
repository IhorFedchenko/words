package com.fedchenko.words;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WordsRestfulService {

    public List<String> processWords(List<String> input) {
        CheckerWords checkerWords = new CheckerWords();
        checkerWords.setWords(input);
        return checkerWords.getWords();
    }
}
