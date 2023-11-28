package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitToRomanNumberTest {
    @Test
    void testToRomanNumber1() {
        int input1 = 1;
        String output1 = "I";

        String actualOutput1 = String.valueOf(DigitToRomanNumber.toRomanNumber(input1));
        assertEquals(output1, actualOutput1);
        System.out.println(input1 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input1));
    }

    @Test
    void testToRomanNumber2() {
        int input2 = 2;
        String output2 = "II";

        String actualOutput = String.valueOf(DigitToRomanNumber.toRomanNumber(input2));
        assertEquals(output2, actualOutput);
        System.out.println(input2 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input2));
    }

    @Test
    void testToRomanNumber3() {
        int input3 = 3;
        String output3 = "III";

        String actualOutput3 = String.valueOf(DigitToRomanNumber.toRomanNumber(input3));
        assertEquals(output3, actualOutput3);
        System.out.println(input3 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input3));
    }

    @Test
    void testToRomanNumber5() {
        int input5 = 5;
        String output5 = "V";

        String actualOutput5 = String.valueOf(DigitToRomanNumber.toRomanNumber(input5));
        assertEquals(output5, actualOutput5);
        System.out.println(input5 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input5));
    }

    @Test
    void testToRomanNumber6() {
        int input6 = 6;
        String output6 = "VI";

        String actualOutput6 = String.valueOf(DigitToRomanNumber.toRomanNumber(input6));
        assertEquals(output6, actualOutput6);
        System.out.println(input6 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input6));
    }

    @Test
    void testToRomanNumber7() {
        int input7 = 7;
        String output7 = "VII";

        String actualOutput7 = String.valueOf(DigitToRomanNumber.toRomanNumber(input7));
        assertEquals(output7, actualOutput7);
        System.out.println(input7 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input7));
    }

    @Test
    void testToRomanNumber8() {
        int input8 = 8;
        String output8 = "VIII";

        String actualOutput8 = String.valueOf(DigitToRomanNumber.toRomanNumber(input8));
        assertEquals(output8, actualOutput8);
        System.out.println(input8 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input8));
    }


    @Test
    void testToRomanNumber10() {
        int input10 = 10;
        String output10 = "X";

        String actualOutput10 = String.valueOf(DigitToRomanNumber.toRomanNumber(input10));
        assertEquals(output10, actualOutput10);
        System.out.println(input10 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input10));
    }

    @Test
    void testToRomanNumber15() {
        int input15 = 15;
        String output15 = "XV";

        String actualOutput15 = String.valueOf(DigitToRomanNumber.toRomanNumber(input15));
        assertEquals(output15, actualOutput15);
        System.out.println(input15 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input15));
    }

    @Test
    void testToRomanNumber50() {
        int input50 = 50;
        String output50 = "L";

        String actualOutput50 = String.valueOf(DigitToRomanNumber.toRomanNumber(input50));
        assertEquals(output50, actualOutput50);
        System.out.println(input50 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input50));
    }

    @Test
    void testToRomanNumber100() {
        int input100 = 100;
        String output100 = "C";

        String actualOutput100 = String.valueOf(DigitToRomanNumber.toRomanNumber(input100));
        assertEquals(output100, actualOutput100);
        System.out.println(input100 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input100));
    }

    @Test
    void testToRomanNumber4() {
        int input4 = 4;
        String output4 = "IV";

        String actualOutput4 = String.valueOf(DigitToRomanNumber.toRomanNumber(input4));
        assertEquals(output4, actualOutput4);
        System.out.println(input4 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input4));
    }

    @Test
    void testToRomanNumber9() {
        int input9 = 9;
        String output9 = "IX";

        String actualOutput9 = String.valueOf(DigitToRomanNumber.toRomanNumber(input9));
        assertEquals(output9, actualOutput9);
        System.out.println(input9 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input9));
    }

    @Test
    void testToRomanNumber19() {
        int input19 = 19;
        String output19 = "XIX";

        String actualOutput19 = String.valueOf(DigitToRomanNumber.toRomanNumber(input19));
        assertEquals(output19, actualOutput19);
        System.out.println(input19 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input19));
    }

    @Test
    void testToRomanNumber114() {
        int input114 = 114;
        String output114 = "CXIV";

        String actualOutput114 = String.valueOf(DigitToRomanNumber.toRomanNumber(input114));
        assertEquals(output114, actualOutput114);
        System.out.println(input114 + " en chiffres romains: " + DigitToRomanNumber.toRomanNumber(input114));
    }
}