package bingo.modelo;

import java.io.*;
import java.net.*;

public class UnaInstancia extends Thread {

    // you may need to customize this for your machine
    public static final int PORT = 5501;

    ServerSocket serverSocket = null;
    Socket clientSocket = null;

    @Override
    public void run() {
        try {
            // Create the server socket
            serverSocket = new ServerSocket(PORT, 1);
            while (true) {
                // Wait for a connection
                clientSocket = serverSocket.accept();
                // System.out.println("*** Got a connection! ");
                clientSocket.close();
            }
        } catch (IOException ioe) {
            System.out.println("Error al generar instancia: " + ioe);
        }
    }
}
