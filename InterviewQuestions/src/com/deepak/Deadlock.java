package com.deepak;
public class Deadlock{  
	  public static void main(String[] args) {  
	    String r1 ="hi";  
	    String r2 ="hello";
	    Thread t1 = new Thread(){ //Deadlock with inner class
	      public void run() {  
	          synchronized (r1){  
	           System.out.println("t1: locked r1");  
	  
	           synchronized (r2) {  
	            System.out.println("t1: locked r2");  
	           }  
	         }  
	      }
	    };
	 
	    Thread t2 = new Thread(){   //Deadlock with inner class
	      public void run() {  
	        synchronized (r2) {  
	          System.out.println("t2: locked r2");  
	  
	          synchronized (r1) {  
	            System.out.println("t2: locked r1");  
	          }  
	        }  
	      }
	    };
	    t1.start();  
	    t2.start();  
	  }  
	}  