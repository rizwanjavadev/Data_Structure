package com.example.demo;

public class Tmax {
public static void main(String[] sr){
    // 22. Maximum sum subarray of size K

    // int []arr= new int []{1,2,3,-8,5,6,7};
    int[] arr = new int[]{1, 2, 3, 4, -5, 6, 7};

    int k = 4;

    int ws = 0;

    // for(int i=0;i<k;i++){
    for ( int i = 0; i < k; i++) {
        ws += arr[i];
    }

    int ms = ws;

    // for(int i=k;i<arr.length;i++){
    for (int i = k; i < arr.length; i++) {

        // ms += arr[i];
        ws += arr[i];

        // ms -= arr[k];
        ws -= arr[i - k];

        // missing: update maximum after changing the window
        ms = Math.max(ms, ws);
    }

    System.out.println(ms);
}}