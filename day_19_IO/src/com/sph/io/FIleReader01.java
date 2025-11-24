package com.sph.io;

import java.io.FileReader;
import java.io.IOException;

public class FIleReader01 {

    public static void main(String[] args) throws IOException {

        String path = "day_19_IO\\a.txt";
        FileReader fr = new FileReader(path);

        int read;
        while ((read  = fr.read()) != -1) {
            System.out.print((char) read);
        }
        fr.close();

    }
}
