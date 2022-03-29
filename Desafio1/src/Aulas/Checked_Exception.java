package Aulas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Checked_Exception {
    public static void main(String[] args) {

        String nomeDoArquivo = "familia-maciel.txt";

//está em negrito por conta do checked exception//
    imprimirArquivoNoConsole(nomeDoArquivo);

    System.out.println("Apesar da exception ou não, o programa continua...");
}

        public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
            File file = new File(nomeDoArquivo);
            
        }
    }
}
