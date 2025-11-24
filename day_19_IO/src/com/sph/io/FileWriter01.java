package com.sph.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) throws IOException {

        String path = "day_19_IO\\a.txt";
        FileWriter fw = new FileWriter(path, true);
        fw.write("我");


        fw.close();
    }
}
