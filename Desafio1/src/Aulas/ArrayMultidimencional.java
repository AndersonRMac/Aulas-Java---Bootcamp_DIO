package Aulas;

import java.util.Random;

public class ArrayMultidimencional {

//Gere e imprima uma matriz M 4 com valores aleatórios entre 0 e 9//    
    public static void main(String[] args) {

        Random num = new Random();

        int [][] M = new int [4][4];    

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[1].length; j++){
                M[i][j] = num.nextInt(9);
            }    
            
        }
        System.out.println("Matriz: ");
        for (int [] linha : M) {
            for (int coluna : linha) {

                System.out.print(coluna + " ");
            }
           System.out.println();
        }

    }
}
