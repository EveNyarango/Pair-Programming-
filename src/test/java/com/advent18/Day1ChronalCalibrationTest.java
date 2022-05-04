package com.advent18;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day1ChronalCalibrationTest {

    @Test
    void checkCalculateCalibrationMethod(){

        //given
        List<Integer> calibrationList = List.of(1,-2,3,1);
        //when
        int expected = Day1ChronalCalibration.calculateCalibration(calibrationList);
        //then
        assertEquals(expected, 3);
    }
}