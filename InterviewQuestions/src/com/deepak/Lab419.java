package com.deepak;

class Lab419{
public static void main(String []args){
String s1=new String("deepak");
String s2=s1.intern();
System.out.println(s1==s2);
String s3="deepak";
System.out.println(s2==s3);
}
}


