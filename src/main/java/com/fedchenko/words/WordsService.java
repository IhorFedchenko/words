package com.fedchenko.words;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordsService {

    public static List<String> processWords(List<String> input) {
        int toIndex = 0;
        try {
            for (int i = 1; i < input.size(); i++) {
                if (input.get(i - 1).endsWith("" + input.get(i).charAt(0))) {
                    toIndex++;
                } else {
                    break;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            // ignore. probably, it was an empty String
        }
        return input.subList(0, toIndex);

    }
}
