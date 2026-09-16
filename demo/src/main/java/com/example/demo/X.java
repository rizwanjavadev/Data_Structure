package com.example.demo;

import java.util.Arrays;

// ❌ Incorrect/unnecessary import:
// import java.lang.reflect.Array;

public class X {
    public static void main(String[] args) {

        // Sum 3
        int[] arr = new int[]{1, 2, 3, 45, 6, 7};
//        int target = 6;
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length - 2; i++) {
//
//            int s = i + 1;
//            int e = arr.length - 1;
//
//            while (s < e) {
//
//                int sum = arr[i] + arr[s] + arr[e];
//
//                if (target == sum) {
//                    System.out.println(i + "," + s + "," + e);
//                    return;
//                }
//
//                if (sum < target) {
//                    s++;
//                } else {
//                    e--;
//                }
//            }
//        }
//            System.out.println("not found target with 3 sum");

        //Maximum Subarray
        int cs=0;
        int ms=0;
        for(int i=0;i<arr.length-1;i++){
            cs=Math.max(cs, arr[i]+cs);
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);

    }
}