package com.sph.Demo01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze {
    public static void main(String[] args) {

        String qq = "12345678901";


        System.out.println(qq.matches("[1-9][0-9]{4,14}"));
        String id = "410325200112099911";
        String mail = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println(id.matches(mail));


        Pattern p = Pattern.compile("1");
        Matcher m = p.matcher(id);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}