package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exercicio7 {
    private ScientificCalculator calculadora;

    @BeforeEach
    void setup(){
        this.calculadora = new ScientificCalculator();
    }

    @Test
    void testErrosEmDivisaoPorZero(){
        RuntimeException errorMessage = Assertions.assertThrows(RuntimeException.class, () -> {
            this.calculadora.divide(4.0, 0.0);
        });
        System.out.println(errorMessage);
    }
}
