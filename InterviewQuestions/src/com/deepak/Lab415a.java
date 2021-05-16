package com.deepak;

interface Inter3{
void m1();
public abstract void m2();
int A=10;
public final int B=20;
}
abstract class Hello3 implements Inter1{
public void m1(){
System.out.println("Hello>m1():");
}}
class Hai3 extends Hello3{
public void m2(){
System.out.println("Hai>m2():");
}
void m3(){
System.out.println("Hai>m3()");
}}
class Lab415a{
public static void main(String[] args){
	Hai3 ref=new Hai3();
ref.m1();
ref.m2();
//ref.m3();
}}
