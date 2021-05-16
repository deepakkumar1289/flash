package com.deepak;

class Fibanacci1{
public static void main(String as[]){
//int n=Integer.parseInt(as[0]); //5

int a=0;
int b=1;
int sum;
for(int i=1;i<=5;i++){
sum=a+b;
System.out.print(" "+sum);
a=b;
b=sum;
}
}
}