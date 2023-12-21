package org.example;

public class Yams {
    
    public static boolean isGrandeSuite(int[] roll){
        for (int i = 0; i < roll.length - 1; i++) {
            if (roll[i] != roll[i + 1] - 1) {
                return false;
            }
        }
        return true;
    }

}