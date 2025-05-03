package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exercicio5 {

    private ScientificCalculator calculadora;

    @BeforeEach
    void setup(){
        this.calculadora = new ScientificCalculator();
    }

    @Test
    void testSquareRootOfPositiveNumber(){
        double expectedResult = 4.0;

        Assertions.assertEquals(expectedResult, this.calculadora.squareRoot(16.0));
        System.out.println("Teste de raiz quadrada de número positivo concluído com sucesso.");
    }
}
