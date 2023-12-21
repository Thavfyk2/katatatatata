package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Yams {
    
    public static boolean isGrandeSuite(int[] roll){
        for (int i = 0; i < roll.length - 1; i++) {
            if (roll[i] != roll[i + 1] - 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean validRoll(int[] roll) {
        return roll.length == 6;
    }

    public static boolean isBrelan(int[] roll) {
        Arrays.sort(roll);

        for (int i = 0; i <= roll.length - 3; i++) {
            if (roll[i] == roll[i + 1] && roll[i] == roll[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCarre(int[] roll) {
        Arrays.sort(roll);

        for (int i = 0; i <= roll.length - 4; i++) {
            if (roll[i] == roll[i + 1] && roll[i] == roll[i + 2]) {
                return true;
            }
        }
        return false;
    }


    public static boolean isFull(int[] roll) {
        Arrays.sort(roll);
        boolean hasPair = false;
        for (int i = 0; i <= roll.length - 2; i++) {
            if (roll[i] == roll[i + 1]) {
                hasPair = !hasPair;
            }
        }
        return hasPair && isBrelan(roll);
    }

    public static boolean isYams(int[] roll) {
        for (int i = 0; i < roll.length - 1; i++) {
            if (roll[i] != roll[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int game(int[][] setOfRolls) {
        int totalScore = 0;

        for (int[] roll : setOfRolls) {
            int[] intRoll = new int[6];

            for (int i = 0; i < roll.length; i++) {
                intRoll[i] = roll[i];
            }

            Arrays.sort(intRoll);

            if (isYams(intRoll)) {
                totalScore += 50;
            } else if (isGrandeSuite(intRoll)) {
                totalScore += 40;
            } else if (isCarre(intRoll)) {
                totalScore += 30;
            } else if (isFull(intRoll)) {
                totalScore += 30;
            } else if (isBrelan(intRoll)) {
                totalScore += 28;
            }
        }

        return totalScore;
    }
}