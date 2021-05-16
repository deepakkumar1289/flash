package com.deepak;

class ReverseGroupOfString1 { 
	public static void main(String[] args) { 
		String str= "Deepak Kumar";
		String a[] = str.split(" "); 
		for(int i=a.length-1;i>=0;i--){
		System.out.print(a[i] + " "); 

		} }}