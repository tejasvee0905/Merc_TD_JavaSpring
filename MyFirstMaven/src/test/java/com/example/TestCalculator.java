package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Test
    public void testFindBig(){
        Calculator obj = new Calculator();
        assertEquals(20,obj.findBig(10,20));
    }

    @Test
    public void testFindSmall(){
        Calculator obj = new Calculator();
        assertEquals(10,obj.findSmall(10,20));
    }

}
