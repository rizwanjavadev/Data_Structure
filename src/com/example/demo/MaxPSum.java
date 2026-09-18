package com.example.demo;

class MaxPSum {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 698};

        // 27. Maximum Product Subarray

int currentMax=arr[0];
int currentMin=arr[0];
int maxProd=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]<0){
        int t=currentMax;
        currentMax=currentMin;
        currentMin=t;
    }
    currentMax=Math.max(currentMax,currentMax*arr[i]);
    currentMin=Math.min(currentMin,currentMin*arr[i]);
    maxProd=Math.max(maxProd,currentMax);
}
        System.out.print("max product"+ maxProd);
    }
}
