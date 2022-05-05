package com.pairprogramming;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCheck {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap();
        boolean result=false;

        for (int i = 0; i < nums.length; i++) {
            if(!numMap.containsKey(nums[i]) && nums[i] > 1){
                numMap.put(nums[i], false);
                result= false;
            } else {
                result= true;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,4,2,3}));
    }
}
