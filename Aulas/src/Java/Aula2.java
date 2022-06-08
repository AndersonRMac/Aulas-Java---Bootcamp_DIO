package Java;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        
        int valor = scan.nextInt();
        
        for (int j = 2; j < valor; j++){
            if (valor % j == 0) {
                System.out.println("FALSE");
                
            }else{
                System.out.println("VERDADE");
            }

        }
    }       
    }
 



        

       


    

