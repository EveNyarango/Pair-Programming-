package com.pairprogramming;

import java.util.HashMap;
import java.util.Map;

public class WordPosition {
    public static String checkWordPosition(String words) {

        String wordsInLowerCase = words.toLowerCase();
        String[] wordsArray = wordsInLowerCase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordMap.containsKey(wordsArray[i])) {
                wordMap.put(wordsArray[i], i);
                stringBuilder.append(i);
            } else {
                stringBuilder.append(wordMap.get(wordsArray[i]));
            }
        }
        return stringBuilder.toString();
    }
}
