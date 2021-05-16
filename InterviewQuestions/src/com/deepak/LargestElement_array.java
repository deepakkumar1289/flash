package com.deepak;

public class LargestElement_array {  
    public static void main(String[] args) {  
        int []a = new int [] {25, 11, 7};   
        int max = a[0];  
        for (int i = 0; i < a.length; i++) {  
           if(a[i] > max)  // for smallest element we use if(arr[i] <min)  all code are same
               max = a[i];  
        }  
        System.out.println(max);  
    }  
}  