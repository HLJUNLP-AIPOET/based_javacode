package com.sph.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) throws IOException {
        String path = "day_19_IO\\a.txt";
        File file = new File(path);
        FileOutputStream fos = new FileOutputStream(file, false);

        String str = "哈喽";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        String str2 = "你好";
        byte[] bytes2 = str2.getBytes();
        int n = 10;
        fos.write(bytes);
        fos.write('\n');
        fos.write(bytes2);


        fos.close();





    }
}
