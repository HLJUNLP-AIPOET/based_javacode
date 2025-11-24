package com.sph.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class demo3 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\sun\\Desktop\\名单.png");

        FileOutputStream fos = new FileOutputStream("day_19_IO\\名单.png");

        Date d = new Date();
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        Date d2 = new Date();
        System.out.println(d2.getTime() - d.getTime());
        fos.close();
        fis.close();
    }
}
