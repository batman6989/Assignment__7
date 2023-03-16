package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalTest {

    @Test
    void twoTimes_three() {
        SimpleCal calculator = new SimpleCal();
        try {
            assertEquals(6, calculator.doMultiplication(2, 3));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    void fifteenTimes_three() {
        SimpleCal calculator = new SimpleCal();
        try {
            assertEquals(45, calculator.doMultiplication(15, 3));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    void twoTimes_four() {
        SimpleCal calculator = new SimpleCal();
        try {
            assertEquals(8, calculator.doMultiplication(2, 4));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    void sixTimes_four() {
        SimpleCal calculator = new SimpleCal();
        try {
            assertEquals(24, calculator.doMultiplication(6, 4));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}