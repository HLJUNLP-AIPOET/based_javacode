package com.sph.usage;

public class demo {
    public static void main(String[] args) {

        int[] arr1 = {11,22,33,44,55};
        int a = array(arr1,22);
        System.out.println("arr1数组中的最大值为：" + a);
    }

    public static int array(int [] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return i;
            }
        }
        return -1;
    }
}
