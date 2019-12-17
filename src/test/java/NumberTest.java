import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class NumberTest {

    @Test
    void testOneDigitNumbers() {

        Number zero = new Number(0);
        assertEquals("zero", zero.toString(), "Expected result didn't match");

        Number one = new Number(1);
        assertEquals("one", one.toString(), "Expected result didn't match");

        Number nine = new Number(9);
        assertEquals("nine", nine.toString(), "Expected result didn't match");
    }

    @Test
    void testTwoDigitNumbers() {

        Number eleven = new Number(11);
        assertEquals("eleven", eleven.toString(), "Expected result didn't match");

        Number twenty = new Number(20);
        assertEquals("twenty", twenty.toString(), "Expected result didn't match");

        Number seventyFour = new Number(74);
        assertEquals("seventy four", seventyFour.toString(), "Expected result didn't match");
    }

    @Test
    void testThreeDigitNumbers() {

        Number hundred = new Number(100);
        assertEquals("hundred", hundred.toString(),
                "Expected result didn't match");

        Number oneHundredFiftySix = new Number(156);
        assertEquals("one hundred and fifty six", oneHundredFiftySix.toString(),
                "Expected result didn't match");

        Number sixHundredFifty = new Number(650);
        assertEquals("six hundred and fifty", sixHundredFifty.toString(),
                "Expected result didn't match");

        Number fourHundredFive = new Number(405);
        assertEquals("four hundred and five", fourHundredFive.toString(),
                "Expected result didn't match");

        Number nineHundredNinetyNine = new Number(999);
        assertEquals("nine hundred and ninety nine", nineHundredNinetyNine.toString(),
                "Expected string didn't match");
    }

    @Test
    void testNumberOutOfBoundsException() {

        Number thousand = new Number(1000);
        assertThrows(NumberOutOfBoundsException.class, thousand::toString,
                "If given number's digit count is more than three, NumberOutOfBoundsException should be thrown!");

        Number negativeNumber = new Number(-1);
        assertThrows(NumberOutOfBoundsException.class, negativeNumber::toString,
                "If given number is below zero, NumberOutOfBoundsException should be thrown!");
    }
}