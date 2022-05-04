package com.advent21;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Day1SonarSweepTest {

    @Test
    void checkForNumberOfIncrease() {
        //given
        List<Integer> reportList = List.of(199, 200, 208, 210, 200, 207, 240,269,260,263);
        //when
        int expected = Day1SonarSweep.checkForNumberOfIncrease(reportList);
        //then
        assertEquals(expected,7);
    }
}