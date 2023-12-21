package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YamsTest {

    int[] invalidRoll1 = {1,2,3,4};
    int[] invalidRoll2 = {1,2,3,4,5,6,7};
    int[] roll = {1,2,3,5,6};
    int[] grandeSuite = {2,3,4,5,6};
    int[] brelan = {4,2,2,2,6};
    int[] carre = {1,1,6,1,1};

    int[] full = {2,2,4,2,4};

    @Test
    void isGrandeSuiteTest(){
        Assertions.assertTrue(Yams.isGrandeSuite(grandeSuite));
    }

    @Test
    void isNotGrandeSuiteTest(){
        Assertions.assertFalse(Yams.isGrandeSuite(roll));
    }

    @Test
    void validRollTest(){
        Assertions.assertFalse(Yams.validRoll(roll));
    }

    @Test
    void notValidRollTest(){
        Assertions.assertFalse(Yams.validRoll(invalidRoll1));
        Assertions.assertFalse(Yams.validRoll(invalidRoll2));
    }

    @Test
    void isBrelanTest(){
        Assertions.assertTrue(Yams.isBrelan(brelan));
    }

    @Test
    void isNotBrelanTest(){
        Assertions.assertFalse(Yams.isBrelan(roll));
    }

    @Test
    void isCarreTest(){
        Assertions.assertTrue(Yams.isCarre(carre));

    }

    @Test
    void isFullTest(){
        Assertions.assertTrue(Yams.isFull(full));

    }

    @Test
    void isNotFullTest(){
        Assertions.assertFalse(Yams.isFull(brelan));
    }

}