package com.advent18;

import java.util.ArrayList;
import java.util.List;

public class Trial {
    public List<Integer> checkProduct(List<Integer> numberList) {
        List<Integer> productList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {
                int product = numberList.get(i) * numberList.get(j);
                productList.add(product);
            }
        }
        return productList;
    }
}
