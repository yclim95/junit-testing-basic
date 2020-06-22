package com.abclearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {
    @Test
    void addTest(){
        Junit jUnit = new Junit();
        int result = jUnit.add(2,3);
        assertEquals(5,result); // Comparison with expected result
    }

    @Test
    void factorialLoopTest(){
        Junit junit = new Junit();
        int result = junit.factorialLoop(5);
        assertEquals(15,result);
    }
}