package Aulas;

import java.util.Random;

public class NumerosAleatorios {
//Fazer um programa que leia 20 numeros aleatorios entre 0 e 100 e armazene-os em um vetor. Ao final mostre os numeros e seus sucessores.
    public static void main(String[] args) {

        Random random = new Random();
        
        int [] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);

            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.println("Sucessores dos Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + " ");
        }

    }
    
}
