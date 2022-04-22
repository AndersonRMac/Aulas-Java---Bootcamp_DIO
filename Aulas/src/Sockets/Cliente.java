package Sockets;

import java.io.IOException;
import java.net.Socket;

class cliente{
    public static void main(String[] args) {

        try {
            Socket cliente = new Socket("localhost", 5225);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}