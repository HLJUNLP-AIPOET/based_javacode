package com.sph.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo2 {

    public static void main(String[] args) throws IOException {

        String path = "day_19_IO\\a.txt";

        FileInputStream fis = new FileInputStream(path);

//        int read = fis.read();
//        System.out.print((char) read);
//        int read2 = fis.read();
//        System.out.print((char) read2);
//        int read3 = fis.read();
//        System.out.print((char) read3);
//        int read4 = fis.read();
//        System.out.print((char) read4);
//        int read5 = fis.read();
//        System.out.print((char) read5);
//        int read6 = fis.read();
//        System.out.print((char) read6);

        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }


        fis.close();


        String str = "ai你";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

    }
}
