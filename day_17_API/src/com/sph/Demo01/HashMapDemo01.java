package com.sph.Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {


        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 18), "北京");
        map.put(new Person("李四", 19), "上海");
        map.put(new Person("李四", 19), "上海");
        map.put(new Person("王五", 20), "广州");
        map.put(new Person("王五", 20), "深圳");

        map.forEach((k, v) -> System.out.println(k + " ---> " + v));

        System.out.println(map);


        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " ====> " + value);
        }
    }
}
