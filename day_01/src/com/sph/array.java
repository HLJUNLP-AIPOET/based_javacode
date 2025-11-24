package com.sph;

public class array {
    public static void main(String[] args) {
        //数组的定义
        int[] arr = new int[5];
        //数组的赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        //数组的使用
        for (int j : arr) {
            System.out.println(j);
        }
        //数组的定义和赋值
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("arr2的长度为：" + arr2.length);
        //数组的使用
        for (int k : arr2) {
            System.out.println(k);
        }
        double [] arr3 = {1, 2, 3, 4, 5};
        System.out.println("arr3的长度为：" + arr3.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        //数组的使用
        for (double k : arr3) {
            System.out.println(k);
        }
        //二维数组的定义和赋值
        int[][] arr4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println(arr4.length); //3
        //二维数组的使用
        for (int[] ints : arr4) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


        int [] arr5 = new int[5];
        System.out.println("arr5的长度为：" + arr5.length);
    }
}
