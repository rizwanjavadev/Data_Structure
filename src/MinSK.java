package com.example.demo;

public class MinSK {
    public static void main(String[] args) {
        //24. Minimum size subarray with sum ≥ K
        int[] arr=new int[]{1,2,3,4,5,5,5,6,7};
        int left=0;
        int right=0;
        int minL=Integer.MAX_VALUE;
        int k=7;
        int sum=0;
        for( right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=k){
                minL=Math.min(minL,right-left+1);
sum-=arr[left];
left++;

            }
        }
        System.out.println(minL);
    }
}
