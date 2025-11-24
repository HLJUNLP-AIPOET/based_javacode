package com.sph.demo;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}


    public static int GetMax(ArrayList<Student> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).getAge()) {
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
