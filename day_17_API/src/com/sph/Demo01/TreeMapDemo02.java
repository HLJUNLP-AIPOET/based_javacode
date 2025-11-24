package com.sph.Demo01;

import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapDemo02 {
    public static void main(String[] args) {

        String abs = "abaaabbcdbcbdcabdcabdcb";

        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < abs.length(); i++) {
            char c = abs.charAt(i);
            if (treeMap.containsKey(c)) {
                int count = treeMap.get(c);
                count++;
                treeMap.put(c, count);
            } else {
                treeMap.put(c, 1);
            }
        }

        System.out.println(treeMap);

        StringBuffer sb = new StringBuffer();

        treeMap.forEach((k, v) -> {
            sb.append(k).append("(").append(v).append(")");
        });

        System.out.println(sb);

        StringJoiner sj = new StringJoiner("", "", "");
        treeMap.forEach((k, v) -> {
            sj.add(k + "").add("(").add(v + "").add(")");
        });

        System.out.println(sj);

    }
}
