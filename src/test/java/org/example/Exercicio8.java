package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exercicio8 {

    private ScientificCalculator calculadora;

    @BeforeEach
    void setup(){
        this.calculadora = new ScientificCalculator();
    }

    @Test
    void testLog(){
        double expectedResult = 1.3862943611198906;
        Assertions.assertEquals(expectedResult, this.calculadora.log(4.0));
    }

    @Test
    void testSeno(){
        double expectedResult = Math.sqrt(3.0)/2;
        Assertions.assertEquals(expectedResult, this.calculadora.sin(60.0));
    }
}
