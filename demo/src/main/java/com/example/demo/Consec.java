package com.example.demo;

public class Consec {

    public static void main(String[] args) {

        int mc = 1;
        int count = 1;

        int[] arr = new int[]{1, 1, 2, 3, 1, 1, 1, 5, 5, 5, 5, 5, 1};

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;

                // mc = Math.max(count, mc);  // your previous line was outside loop

            } else {
                count = 1;
            }
            mc = Math.max(mc, count);
        }

        System.out.println(mc);
    }
}