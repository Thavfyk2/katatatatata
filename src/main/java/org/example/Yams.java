package org.example;

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
}