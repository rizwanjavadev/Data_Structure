package com.example.demo;
public class MostWC{

public static void main(String[] args) {
    int[] arr=new int[]{1,2,3,4,5,6,7,8,3,2,9,9,89};
    int l=0;int r=arr.length-1;
    int msw=0;
    while(l<r){
        int width=r-l;
        int h=Math.min(arr[l],arr[r]);
        int ans=width*h;
        msw=Math.max(ans,msw);
        if(arr[l]<arr[r])
            l++;
        else r--;
    }
    System.out.println(msw);}
        }