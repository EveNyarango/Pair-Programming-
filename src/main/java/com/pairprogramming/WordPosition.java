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
            if (wordMap.containsKey(wordsArray[i])) {
                stringBuilder.append(wordMap.get(wordsArray[i]));
            } else {
                wordMap.put(wordsArray[i], i);
                stringBuilder.append(i);
            }
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        checkWordPosition("Ask not what your country can do for you ask what you can do for your country");
    }
}
