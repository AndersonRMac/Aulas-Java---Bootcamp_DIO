package AulaCollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI{
    public static void main(String[] args) {
        
        List<String> numerosAleatorios = 
            Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        /*System.out.println("Imprima todos os elementos desta lista de String: ");
          
        numerosAleatorios.stream().forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        
        });*/

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um SET: ");
            
        numerosAleatorios.stream()
        .limit(5)
        .collect(Collectors.toSet())
        .forEach(System.out::println);
    }
}