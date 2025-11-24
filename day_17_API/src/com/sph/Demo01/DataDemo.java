package com.sph.Demo01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        SimpleDateFormat simp = new SimpleDateFormat();
        sdf.setLenient(false);

        Date date = new Date();
        System.out.println(simp.format(date));


        Date date2 = new Date(0L);
        System.out.println(sdf.format(date2));


        Date date3 = new Date(60L*1000*60*24*365);
        System.out.println(sdf.format(date3));


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


    }
}
