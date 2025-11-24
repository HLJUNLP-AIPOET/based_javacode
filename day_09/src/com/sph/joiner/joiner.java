package com.sph.joiner;

import java.util.StringJoiner;

public class joiner {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C++", "JavaScript"};
        String joined = String.join(" | ", words);
        System.out.println(joined);


        StringJoiner joiner = new StringJoiner(" | ", "[", "]");
        for (String word : words) {
            joiner.add(word);
        }
        System.out.println(joiner.toString());
    }
}
