package com.deepak;

class ReverseNumber { 
	public static void main(String as[]){
		int n=123;
		int rev=0;
		while(n!=0){
		int rem=n%10;
		rev=rem+rev*10;
		n=n/10;
		}
		System.out.println(rev);
		}
		}