package com.camargovf.calculadorasoftware.calculadora;

public class Calculadora {

    public double sum(double... numbers) {
        double sum = 0;

        if (numbers.length > 0) {
            for (double number : numbers) {
                sum += number;
            }
        }

        return sum;

    }

    public double raizQuadrada(double number){
        if(number < 0 ){
            throw new IllegalArgumentException("Não existe raíz quadrada real para números negativos");

        }
        return Math.sqrt(number);

    }

    public boolean isImpar(int number) {
        if(number % 2 !=0) {
            return true;

        }
        return false;
    }
}
