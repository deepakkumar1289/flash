package com.deepak;

interface Inter1{
void m1();
public abstract void m2();
}
class Hello2 implements Inter1{
public void m1(){
System.out.println("Hello>m1()");
}
public void m2(){
System.out.println("Hello>m2()");
}}
class Lab414a{
public static void main(String[] args){
	Hello2 ref=new Hello2();
ref.m1();
ref.m2();
}}
