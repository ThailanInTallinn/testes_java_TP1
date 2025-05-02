package org.example;

import org.example.fixtures.CalculatorFixture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio2 {

    ScientificCalculator calculator = new ScientificCalculator();

    @Test
    void testAddition(){
        double expectedResult = 6.0;
        Assertions.assertEquals(expectedResult, calculator.add(2.0, 4.0));
    }

}
