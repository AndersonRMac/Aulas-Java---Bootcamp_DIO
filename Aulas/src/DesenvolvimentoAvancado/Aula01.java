package DesenvolvimentoAvancado;

import java.util.function.UnaryOperator;

public class Aula01 {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezesTres = valor -> valor*3;
        int valor = 10;

        System.out.println("O valor da multiplicação é: " + calcularValorVezesTres.apply(valor));
    }
    
}
