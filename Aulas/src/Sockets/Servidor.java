package Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Servidor{
    public static void main(String[] args) {
        
        try {
            System.out.println("Servidor Iniciado!");
            ServerSocket servidor = new ServerSocket(5225);
            

            //abrir o vigia de conexão socket com o cliente//
            System.out.println("Aguardando conexão...");

            
            Socket cliente = servidor.accept();

            System.out.println("Conectado ao cliente: " + cliente.getInetAddress().getHostAddress());
            Scanner entrada = new Scanner(cliente.getInputStream());
            
            while (true) {
                String msg = entrada.nextLine();
                System.out.println(msg);

                if (msg.equals("fim")) break;
            }

        } catch (IOException e) {
            System.out.println("Conexão com servidor falhou!");
            e.printStackTrace();
        }
    }
}