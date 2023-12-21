package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YamsTest {

    int[] invalidRoll1 = {1,2,3,4};
    int[] invalidRoll2 = {1,2,3,4,5,6,7};
    int[] chance = {1,2,3,5,6};
    int[] grandeSuite = {2,3,4,5,6};
    int[] brelan = {4,2,2,2,6};
    int[] carre = {1,1,6,1,1};
    int[] full = {2,2,4,2,4};
    int[] yams = {1,1,1,1,1};
    int[][] roll_178_score = {grandeSuite, brelan, carre, yams, full, chance};
    int[][] roll_brelan = {brelan};



    @Test
    void isGrandeSuiteTest(){
        Assertions.assertTrue(Yams.isGrandeSuite(grandeSuite));
    }

    @Test
    void isNotGrandeSuiteTest(){
        Assertions.assertFalse(Yams.isGrandeSuite(chance));
    }

    @Test
    void validRollTest(){
        Assertions.assertFalse(Yams.validRoll(chance));
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
        Assertions.assertFalse(Yams.isBrelan(chance));
    }

    @Test
    void isCarreTest(){ Assertions.assertTrue(Yams.isCarre(carre)); }

    @Test
    void isFullTest(){ Assertions.assertTrue(Yams.isFull(full)); }

    @Test
    void isNotFullTest(){
        Assertions.assertFalse(Yams.isFull(brelan));
    }

    @Test
    void isYams(){
        Assertions.assertTrue(Yams.isYams(yams));
    }

    @Test
    void isChance(){ Assertions.assertEquals(17, Yams.isChance(chance)); }

    @Test
    void scoreOfTheGame(){
        Assertions.assertEquals(195, Yams.game(roll_178_score), "178 POINTS");
        Assertions.assertEquals(28, Yams.game(roll_brelan));
    }
}