package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitToRomanNumberTest {

    @ParameterizedTest
    @MethodSource("provideNumbersForTesting")
    void toRomanNumberTest(int input, String expectedOutput) {
        String actualOutput = DigitToRomanNumber.toRomanNumber(input).toString();
        assertEquals(expectedOutput, actualOutput);
        System.out.println(input + " en chiffres romains: " + actualOutput);
    }

    private static Stream<Arguments> provideNumbersForTesting() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(10, "X"),
                Arguments.of(15, "XV"),
                Arguments.of(50, "L"),
                Arguments.of(100, "C"),
                Arguments.of(4, "IV"),
                Arguments.of(9, "IX"),
                Arguments.of(19, "XIX"),
                Arguments.of(114, "CXIV")
                );
    }
}