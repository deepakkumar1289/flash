package com.deepak;

public class DecimalToBinary{    
public static void main(String arg[]){	
 
    int n=17;
    int  a[]=new int[100];
    int i = 0;
    while(n > 0){
    a[i] = n%2;
       n = n/2;
    i++;
    }
    for(int j = i-1;j >= 0;j--){
       System.out.print(a[j]);
   }
}
}