package com.sph.file;

import java.io.File;

public class fileDemo2 {


    public static void main(String[] args) {

        File src = new File("D:\\");
        findDiv(src);

    }


    public static void findDiv(File src){
        File[] f = src.listFiles();
        if (f!=null){
            for (File file : f) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    if (fileName.endsWith(".mp4")) {
                        System.out.println(file+": "+fileName);
                    }
                } else {
                    findDiv(file);
                }
            }
        }
    }
}
