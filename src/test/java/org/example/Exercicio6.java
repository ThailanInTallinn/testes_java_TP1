package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exercicio6 {
    private ScientificCalculator calculadora;

    @BeforeEach
    void setup(){
        this.calculadora = new ScientificCalculator();
    }

    @Test
    void testSquareRootOfNegativeNumber(){
        RuntimeException errorMessage = Assertions
                .assertThrows( RuntimeException.class, () -> {this.calculadora.squareRoot(-4.0);});
        System.out.println(errorMessage);
    }
}
