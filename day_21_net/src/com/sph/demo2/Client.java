package com.sph.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("127.0.0.1", 9999);

        String msg = "见到您很高兴!";
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(msg.getBytes());

        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int b;
        while ((b = inputStreamReader.read()) != -1) {
            System.out.print((char)b);
        }

        socket.close();

    }
}
