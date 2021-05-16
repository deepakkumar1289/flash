package com.deepak;

class ReverseGroupOfString { 
		public static void main(String[] args) { 
		String str= "Deepak Kumar Singh"; 
		System.out.println(str);
		System.out.println(""); 
		String a[] = str.split(""); 
		for(int i=a.length-1;i>=0;i--){
		System.out.print(a[i] + ""); 

		} }}