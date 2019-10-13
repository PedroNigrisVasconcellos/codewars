package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    static String encode(String word) {

        final String lowerCaseWord = word.toLowerCase();

        // Letter occurrence data structure
        final Map<String, Integer> letterOccurrence = new HashMap<>();

        lowerCaseWord
                .chars()
                .mapToObj(Character::toChars)
                .map(String::new)
                .forEach(letter -> letterOccurrence.merge(letter, 1, Integer::sum));

        final StringBuilder newWord = new StringBuilder();

        lowerCaseWord
                .chars()
                .mapToObj(Character::toChars)
                .map(String::new)
                .map(letterOccurrence::get)
                .forEach(occurrence -> newWord.append(encodeLetter(occurrence)));

        return newWord.toString();
    }

    private static String encodeLetter(int occurrence) {
        if (occurrence == 1) {
            return "(";
        }

        return ")";
    }
}
