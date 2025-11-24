package com.sph.demo1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b = inputStreamReader.read()) != -1) {
            System.out.print((char) b);
        }

        socket.close();
        serverSocket.close();

    }
}
