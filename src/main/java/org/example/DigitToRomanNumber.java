package org.example;

import java.util.Map;

class DigitToRomanNumber {

    static final Map<Integer, String> ROMANS_NUMBERS = Map.of(
            1, "I",
            2, "II",
            3, "III",
            5, "V",
            10, "X",
            50, "L",
            100, "C",
            4, "IV",
            9, "IX"
    );

    public static StringBuilder toRomanNumber(int digit) {
        int digitCopy = digit;
        StringBuilder result = new StringBuilder();

        while(digitCopy != 0) {

            if (digitCopy >= 100) {
                digitCopy -= 100;
                result.append(ROMANS_NUMBERS.get(100));
            }
            if (digitCopy >= 50) {
                digitCopy -= 50;
                result.append(ROMANS_NUMBERS.get(50));
            }
            if (digitCopy >= 10) {
                digitCopy -= 10;
                result.append(ROMANS_NUMBERS.get(10));
            }
            if (digitCopy == 9) {
                digitCopy -= 9;
                result.append(ROMANS_NUMBERS.get(9));
            }
            if (digitCopy >= 5) {
                digitCopy -= 5;
                result.append(ROMANS_NUMBERS.get(5));
            }
            if (digitCopy == 4) {
                digitCopy -= 4;
                result.append(ROMANS_NUMBERS.get(4));
            }
            if (digitCopy >= 1) {
                digitCopy--;
                result.append(ROMANS_NUMBERS.get(1));
            }
        }
        return result;
    }
}
