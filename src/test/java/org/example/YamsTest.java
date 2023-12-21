package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YamsTest {

    int[] invalidRoll1 = {1,2,3,4};
    int[] invalidRoll2 = {1,2,3,4,5,6,7};
    int[] roll1 = {1,2,3,5,6};
    int[] grandeSuite = {2,3,4,5,6};
    int[] brelan = {4,2,2,2,6};



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

    @Test
    void notValidRollTest(){
        Assertions.assertFalse(Yams.validRoll(invalidRoll1));
        Assertions.assertFalse(Yams.validRoll(invalidRoll2));
    }

    @Test
    void isBrelan(){
        Assertions.assertTrue(Yams.isBrelan(brelan));
    }

    @Test
    void isNotBrelan(){
        Assertions.assertFalse(Yams.isBrelan(roll1));
    }
}