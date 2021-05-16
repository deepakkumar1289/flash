package com.deepak;

class WithoutLoopPrint1to10 { 
	 public static void m1(int n) {
	        if (n <= 10) {
	            System.out.println(n);
	            m1(n + 1);
	        }
	    }

	    public static void main(String[] args){
	    	WithoutLoopPrint1to10.m1(1);
	    }
	}
