package com.advent21;

import java.util.List;

public class Day1SonarSweep {
    public static int checkForNumberOfIncrease(List<Integer> numbers){
        int count = 0;
        for (int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) > numbers.get(i-1)){
                count++;
            }
        }
        return count;
    }
}
