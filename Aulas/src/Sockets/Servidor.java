package Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


class Servidor{
    public static void main(String[] args) {

        try {
            System.out.println("Servidor Iniciado...");

            ServerSocket servidor = new ServerSocket(5225);
            System.out.println("Aguardando conexão");
            Socket cliente = servidor.accept();

            System.out.println("Nova conexão com cliente: " + cliente.getInetAddress().getHostAddress());


        } catch (IOException e) {
            System.out.println("Deu Ruim!");

        }

    }
}