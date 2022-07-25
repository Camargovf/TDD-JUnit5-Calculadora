package com.camargovf.calculadorasoftware.calculadoratest;

import com.camargovf.calculadorasoftware.calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void DeveRetornarZeroQuandoNenhumValorForDado() {

        Calculadora calculadora = new Calculadora();

        double sum = calculadora.sum();

        Assertions.assertEquals(0, sum);
    }

    @Test
    public void DeveRetornarSomaDosValores() {

        Calculadora calculadora = new Calculadora();

        double sum = calculadora.sum(2, 4);

        Assertions.assertEquals(6, sum);
    }

    @Test
    public void ExcecaoNumerosMenorZero() {

        Calculadora calculadora = new Calculadora();

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculadora.raizQuadrada(-1));

        Assertions.assertEquals("Não existe raíz quadrada real para números negativos", exception.getMessage());
    }

    @Test
    public void DeveRetornarARaizQuadrada() {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.raizQuadrada(4);

        Assertions.assertEquals(2, result);
    }

    @Test
      public void VerificarImpar(){

        Calculadora calculadora = new Calculadora();

        boolean impar = calculadora.isImpar(5);

        Assertions.assertTrue(impar);

    }

    @Test
    public void VerificarImparFalso(){
        Calculadora calculadora = new Calculadora();

        boolean impar = calculadora.isImpar(2);
        Assertions.assertFalse(false);
    }

}