package com.example.demo;
import java.util.*;

public class Kdans {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 45, 6, 8,-78,7};

        int cs = 0;
        int ms = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs, ms);
        }

        // ❌ Your previous code:
        // System.out.println(ms);

        System.out.println(ms);
    }
}