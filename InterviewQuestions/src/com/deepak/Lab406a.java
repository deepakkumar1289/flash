package com.deepak;

class Singleton {
	 
public static Singleton newInstance() {
return new Singleton();
}
 
}
class SubSingle extends Singleton {
 
public static Singleton newInstance() {
return new SubSingle();
}
 
}
class Lab406a{
public static void main(String[] args){
	Singleton s1=new SubSingle();
s1.newInstance();
}}
