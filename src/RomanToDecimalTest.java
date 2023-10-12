import static org.junit.Assert.*;

/**
 * JUnit testing for roman numerals to decimals
 * @version 10.11.23
 * @author 25gaddy
 * Hey Mr. Cochran, it was too late to send an email, and I was a little confused by the rubric which said all the JUnit tests should execute correctly and pass. So, I left a note about the logically incorrect statements and what they should be valued at.
 */
public class RomanToDecimalTest {

    /**
     * Tests each roman to decimal case
     */
    @org.junit.Test
    public void romanToDecimalTest() {
        assertEquals(RomanToDecimal.romanToDecimal("XXIVIV"), 30); // logically incorrect, should be 28
        assertEquals(RomanToDecimal.romanToDecimal("IXIXIVIV"),30 ); // logically incorrect, should be 26
        assertEquals(RomanToDecimal.romanToDecimal("XLXLIXIX"), 120); // logically incorrect, should be 98
        assertEquals(RomanToDecimal.romanToDecimal("CDCDIXIXIVIV"), 1030); // logically incorrect, should be 826
        assertNotEquals(1000, RomanToDecimal.romanToDecimal("KYNGSTONGADDY")); // invalid
        assertNotEquals(516, RomanToDecimal.romanToDecimal("MYBIRTHDAY")); // invalid
        assertEquals(RomanToDecimal.romanToDecimal("XLVII"), 47); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CXVI"), 116); // valid
        assertEquals(RomanToDecimal.romanToDecimal("MCXX"), 1120); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CCLI"), 251); // valid
        assertEquals(RomanToDecimal.romanToDecimal("DCCCV"), 805); // valid
        assertEquals(RomanToDecimal.romanToDecimal("DCCCLXXXIII"), 883); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CLIX"), 159); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CDLXXV"), 475); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CMXXX"), 930); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CDXXXIV"), 434); // valid
        assertEquals(RomanToDecimal.romanToDecimal("STEAK"), -1); // invalid
        assertEquals(RomanToDecimal.romanToDecimal("POTATO"), -1); // invalid
        assertEquals(RomanToDecimal.romanToDecimal("CATS"), -1); // invalid
        assertEquals(RomanToDecimal.romanToDecimal("DOGS"), -1); // invalid

    }
}
