package com.deepak;

class Fibanacci{
public static void main(String as[]){
int n=Integer.parseInt(as[0]); 
//int n=5;
int a=0;
int b=1;
System.out.print(a+" "+b);
for(int i=1;i<=n-2;i++){
//for(int i=1;i<=3;i++){
int sum=a+b;
System.out.print(" "+sum);
a=b;
b=sum;
}
}
}