package org.free.data.test;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class RangeTestToString {

    private Range range;

    @Before
    public void setUp() {
        // This method will run before each test case to set up the environment.
    }

    // Test toString() with normal range
    @Test
    public void testToString_NormalRange() {
        range = new Range(1.0, 5.0);  // Create a Range with lower = 1.0 and upper = 5.0
        String result = range.toString();
        assertEquals("Range[1.0,5.0]", result);  // Expect the string representation "Range[1.0,5.0]"
    }

    // Test toString() with a range where lower and upper are equal
    @Test
    public void testToString_EqualLowerAndUpper() {
        range = new Range(3.0, 3.0);  // Create a Range with lower = 3.0 and upper = 3.0
        String result = range.toString();
        assertEquals("Range[3.0,3.0]", result);  // Expect the string representation "Range[3.0,3.0]"
    }

    // Test toString() with negative values for both lower and upper
    @Test
    public void testToString_NegativeRange() {
        range = new Range(-5.0, -1.0);  // Create a Range with lower = -5.0 and upper = -1.0
        String result = range.toString();
        assertEquals("Range[-5.0,-1.0]", result);  // Expect the string representation "Range[-5.0,-1.0]"
    }

    // Test toString() with zero as lower and upper
    @Test
    public void testToString_ZeroRange() {
        range = new Range(0.0, 0.0);  // Create a Range with lower = 0.0 and upper = 0.0
        String result = range.toString();
        assertEquals("Range[0.0,0.0]", result);  // Expect the string representation "Range[0.0,0.0]"
    }

    // Test toString() with positive and negative values for lower and upper
    @Test
    public void testToString_PositiveAndNegativeRange() {
        range = new Range(-2.0, 2.0);  // Create a Range with lower = -2.0 and upper = 2.0
        String result = range.toString();
        assertEquals("Range[-2.0,2.0]", result);  // Expect the string representation "Range[-2.0,2.0]"
    }

}
