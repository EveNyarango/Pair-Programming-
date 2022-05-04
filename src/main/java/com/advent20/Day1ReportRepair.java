package com.advent20;

import java.util.List;

public class Day1ReportRepair {
    public static int checkFor2020ThenMultiply(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i +1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == 2020) {
                    return numbers.get(i) * numbers.get(j);
                }
            }
        }
        return 0;
    }
}
