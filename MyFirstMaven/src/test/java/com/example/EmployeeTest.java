package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private static final double DELTA = 0.0001;

    @Test
    void testProgrammerIncrement() {
        Employee e = new Employee(1, "Asha", 100000, "Programmer", 30);
        assertEquals(110000.0, e.computeSalary(), DELTA);
    }

    @Test
    void testDesignerIncrementAndDeduction() {
        Employee e = new Employee(2, "Ravi", 80000, "Designer", 40);
        assertEquals(76000.0, e.computeSalary(), DELTA);
    }

    @Test
    void testExactAllowedLeaves() {
        Employee e = new Employee(4, "Kiran", 50000, "Programmer", 32);
        assertEquals(55000.0, e.computeSalary(), DELTA);
    }
}