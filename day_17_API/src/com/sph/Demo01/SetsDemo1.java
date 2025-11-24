package com.sph.Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SetsDemo1 {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(1);
//        System.out.println(list.get(1));
//        System.out.println(list.size());
//        System.out.println(list.contains(1));
//
//        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add(1);
//        linkedHashSet.add(2);
//        System.out.println(linkedHashSet);
//        System.out.println(linkedHashSet.size());
//
//
//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(1);
//        hashSet.add(2);
//        hashSet.add(3);
//        hashSet.add(4);
//        System.out.println(hashSet);
//        System.out.println(hashSet.size());
//
//
//        System.out.println("------------------------");
//        Iterator<Integer> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            Integer integer = iterator.next();
//            if (1 == integer) {
//                iterator.remove();
//            }
//            System.out.print(integer);
//        }
//
//        list.forEach(System.out::print);
//
//
//        for (Integer integer : list) {
//            System.out.print(integer);
//        }
//
//        for (Integer i : hashSet) {
//            System.out.print(i);
//        }
//        System.out.println();

//        Queue queue = new LinkedList();
//        queue.offer(1);
//        queue.offer(2);
//        queue.poll();
//        System.out.println(queue);
//
//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.pop();
//        System.out.println(stack);




        TreeMap treeMap = new TreeMap();
        treeMap.put(3,"a");
        treeMap.put(1,"b");
        treeMap.put(2,"c");


        System.out.println(treeMap.get(1));
        System.out.println(treeMap);

        System.out.println(treeMap.containsValue("a"));

        Map<Integer, Integer> integerIntegerMap = new HashMap();
        integerIntegerMap.put(1,4);
        integerIntegerMap.put(2,8);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : integerIntegerMap.entrySet()) {
            System.out.println("键"+integerIntegerEntry.getKey() + "、 值" + integerIntegerEntry.getValue());
        }
//        System.out.println(integerIntegerMap.keySet());
        System.out.println(integerIntegerMap.entrySet());
//        System.out.println(integerIntegerMap.get(2));
        System.out.println(integerIntegerMap);

        integerIntegerMap.forEach((k,v)->{
            System.out.println("k:"+k+" v:"+v);
        });


//
//        HashSet<String> set = new HashSet<String>();
//        set.add("apple");
//        set.add("banana");
//        set.add("orange");
//        set.add("apple"); // Duplicate element, will not be added
//
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }
//
//        System.out.println(set);
//




//        TreeSet<String> set = new TreeSet<String>();
//        set.add("banana");
//        set.add("apple");
//        set.add("orange");
//        set.add("apple"); // Duplicate element, will not be added
//
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }


//        TreeSet<Integer> integers = new TreeSet<>();
//        integers.add(5);
//        integers.add(2);
//        integers.add(8);
//        integers.add(1);
//
//        Iterator<Integer> iterator1 = integers.iterator();
//        while (iterator1.hasNext()) {
//            Integer integer = iterator1.next();
//            System.out.println(integer);
//        }
//
//        System.out.println(integers);

    }
}
