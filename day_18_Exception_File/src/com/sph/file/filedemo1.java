package com.sph.file;

import java.io.File;
import java.util.Date;
import java.util.HashMap;

public class filedemo1 {
    public static void main(String[] args) {

        String path = "C:\\Users\\sun\\Desktop\\";

        Date date = new Date();
        File file = new File(path);
//        System.out.println("文件名称："+file.getName());
//        System.out.println("是否是文件夹："+file.isDirectory());
//        System.out.println("是否是文件："+file.isFile());
//        System.out.println("文件路径："+file.getPath());
//        System.out.println("文件绝对路径："+file.getAbsolutePath());
//        System.out.println("文件父路径："+file.getParent());
//        System.out.println("文件长度："+file.length()+"字节");
//        date.setTime(file.lastModified());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("最后一次修改时间："+sdf.format(date));



        HashMap<String, Integer> hmp = new HashMap<>();

        int count = 0;
        String [] files = file.list();

        for (int i = 0; i < files.length; i++) {
            String houzhui = null;
            try {
                houzhui = files[i].split("\\.")[1];
                if (hmp.containsKey(houzhui)) {
                    count = hmp.get(houzhui) + 1;
                    hmp.put(houzhui, count);
                }else {
                    hmp.put(houzhui, 1);
                }
            } catch (Exception e) {
            }
        }

        hmp.entrySet().stream().forEach(e -> {
            System.out.println("后缀名：" + e.getKey() + "，数量：" + e.getValue());
        });







//        System.out.println("----------------------------------------------------------------------------");
//        File[] file1 = file.listFiles((dir, name) -> name.endsWith(".lnk"));
//        for (int i = 0; i < file1.length; i++) {
//            System.out.println(file1[i].toString().split("Desktop")[1].substring(1));
//        }



    }
}
