package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringReverseTest {


    @Test
    void keepsNonLettersInPlace() {

        String input = "J@va the be$t!123";
        String result = StringReverse.reverseLetter(input);
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void returnsEmptyForEmptyInput() {

        String input = "";
        String result = StringReverse.reverseLetter(input);
        assertEquals("", result);
    }

    @Test
    void singleLetterA_staysUnchanged() {

        String input = "a";
        String result = StringReverse.reverseLetter(input);
        assertEquals("a", result);
    }

    @Test
    void stringWithoutLettersUnchange() {

        String input = "123 !@#";
        String result = StringReverse.reverseLetter(input);
        assertEquals("123 !@#", result);
    }

    @Test
    void reversesOnlyLetters() {

        String input = "abcd";
        String result = StringReverse.reverseLetter(input);
        assertEquals("dcba", result);
    }

    @Test
    void nonLetterCharactersRemainInPlace() {

        String input = "1!abc-dfg!1";
        String result = StringReverse.reverseLetter(input);
        assertEquals("1!gfd-cba!1", result);
    }

    @Test
    void uppercaseLetterMovesToCorrectPosition () {

        String input = "Abcd";
        String result = StringReverse.reverseLetter(input);
        assertEquals("dcbA", result);
    }

    @Test
    void throwsOnNull() {
        assertThrows(NullPointerException.class, () -> {
            StringReverse.reverseLetter(null);
        });
    }
}
