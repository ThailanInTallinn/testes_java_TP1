package org.example;

import org.example.fixtures.CalculatorFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exercicio3 {

    ScientificCalculator calculadora;
    double expectedResult = 0.0;

    //Setup parte 2
    @BeforeEach
    void setup() {
        this.calculadora = CalculatorFixture.criarCalculadora();
        this.expectedResult = 6.0;
        System.out.println("Preparando testes.");
    }

    //Teardown
    @AfterEach
    void tearDown(){
        this.expectedResult = 0.0;
        System.out.println("Teste finalizado.");
    }


    @Test
    void testSubtract() {
        //Execution
        double actualResult = this.calculadora.subtract(12.0, 6.0);

        //Assertion
        Assertions.assertEquals(this.expectedResult, actualResult);
    }

}
