package Aulas;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

public class Exception_personalizada {
        public static void main(String[] args) {
        
            int [] numerador = {4, 5, 8, 10};
            int [] denominador = {2, 4, 0, 2, 8};

            for (int i = 0; i < denominador.length; i++) {
            try{
                if (numerador[i] %2 != 0) 
                    throw new DivisaoNaoExataEception("Divisão não exata", numerador[i], denominador[i]); 
   
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);  
                
                //POSSO COLOCAR AS DEMAIS EXCEPTIONS NO CATCH//
            }catch(DivisaoNaoExataEception | ArithmeticException | ArrayIndexOutOfBoundsException e ){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }        
            System.out.println("O programa continua...");
    }

}
//CRIANDO A EXCEPTION PERSONALIZADA
class DivisaoNaoExataEception extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExataEception (String messge,int numerador, int denominador){
        super(messge);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}