package com.advent18;

import java.util.List;

public class Day1ChronalCalibration {
    public static int calculateCalibration(List<Integer> calibrationList){
        int calibration = 0;
        for(int i= 0; i< calibrationList.size(); i++){
            calibration += calibrationList.get(i);
        }
        return calibration;
    }

    public static void main(String[] args) {
        calculateCalibration(List.of(1,-2,3,1));
    }
}
