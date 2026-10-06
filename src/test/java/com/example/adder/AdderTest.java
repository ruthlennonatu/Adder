package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(5, Adder.add(2, 3));
    }

    @Test
    void shouldHandleNegativeNumbers() {
        assertEquals(-5, Adder.add(-2, -3));
    }

    @Test
    void securityShouldHandleIntegerBoundaryValues() {
        assertEquals(Integer.MAX_VALUE, Adder.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, Adder.add(Integer.MIN_VALUE, 0));
    }
}