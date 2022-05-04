package com.advent20;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day1ReportRepairTest {

    @Test
    void checkFor2020ThenMultiply() {
        //given
        List<Integer> numberList = List.of(1721, 979,366, 299,675,1456);
        //when
        int actual = Day1ReportRepair.checkFor2020ThenMultiply(numberList);
        //then
        assertEquals(514579, actual);
    }

    @Test
    void checkFor2020Random() {
        //given
        List<Integer> numberList = List.of(979, 1010,366, 299,675,1456);
        //when
        int actual = Day1ReportRepair.checkFor2020ThenMultiply(numberList);
        //then
        assertEquals(0, actual);
    }
}