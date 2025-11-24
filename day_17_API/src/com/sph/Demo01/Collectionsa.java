package com.sph.Demo01;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsa {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll(list, "a", "b", "c");

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

        Collections.swap(list, 0, 1);
        System.out.println(list);
    }
}
