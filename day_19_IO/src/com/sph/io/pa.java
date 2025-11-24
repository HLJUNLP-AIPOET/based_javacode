package com.sph.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pa {
    public static void main(String[] args) throws IOException {

        String path = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";

        String Filepath = "day_19_IO\\name.txt";
        String s = webCrawler(path);
//        System.out.println(s);

        ArrayList<String> namelist = getData(s,"(\\W{4})(，|。)",1);
//        System.out.println(namelist);

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(Filepath));
        ArrayList<String> name = new ArrayList<>();
        for (String string : namelist) {
            for (char c : string.toCharArray()) {
                name.add(c+"");
                osw.write(c+" ");
            }
        }
        System.out.println(name);

        osw.close();
    }

    private static ArrayList<String> getData(String name , String pattern, int index) {

        ArrayList<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(name);
        while (matcher.find()) {
//            System.out.println(matcher.group(index));
            list.add(matcher.group(index));
        }
        return list;
    }

    public static String webCrawler(String net) throws IOException {
        StringBuffer sb = new StringBuffer();

        URL url = new URL(net);
        URLConnection urlConnection = url.openConnection();

        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
