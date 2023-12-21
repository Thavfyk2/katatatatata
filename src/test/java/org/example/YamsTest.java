package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YamsTest {
    int[] roll1 = {1,2,3,5,6};
    int[] grandeSuite = {2,3,4,5,6};

    @Test
    void isGrandeSuiteTest(){
        Assertions.assertTrue(Yams.isGrandeSuite(grandeSuite));
    }

    @Test
    void isNotGrandeSuiteTest(){
        Assertions.assertFalse(Yams.isGrandeSuite(roll1));
    }

    @Test
    void validRollTest(){
        Assertions.assertFalse(Yams.validRoll(roll1));
    }


}