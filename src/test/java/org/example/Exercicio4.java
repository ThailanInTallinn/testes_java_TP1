package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exercicio4 {

    private ScientificCalculator calculadora;

    @BeforeEach
     void setup(){
        this.calculadora = new ScientificCalculator();
    }

    //SEM FACTORY METHOD

    @Test
    void testSubtraction(){
        double expectedResult = 120.0;
        Assertions.assertEquals(expectedResult, calculadora.subtract(121.0, 1.0));
        System.out.println("Teste sem factory method concluído.");
    }

    //COM FACTORY METHOD

    private double criarResultado(double a, double b){
        return this.calculadora.subtract(a, b);
    }

    @Test
    void testSubtractionComFactoryMethod(){
        Assertions.assertEquals(45.0, criarResultado(145.0, 100.0));
        System.out.println("Teste com factory method concluído.");
    }





}
