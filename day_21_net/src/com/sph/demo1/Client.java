package com.sph.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",9999);

        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容：");
            String input = scanner.nextLine();
            if (input.equals("886")) {
                break;
            }
            outputStream.write(input.getBytes());
        }

        socket.close();
    }
}
