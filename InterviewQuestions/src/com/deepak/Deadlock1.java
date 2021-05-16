package com.deepak;
public class Deadlock1{
	  static Object r1 = new Object();
	  static Object r2 = new Object();

	   public static void main(String args[]) {
	      Thread1 t1 = new Thread1();
	      Thread2 t2 = new Thread2();
	      t1.start();
	      t2.start();
	   }
	  static class Thread1 extends Thread {
	      public void run() {
	         synchronized (r1) {
	            System.out.println("t1: Holding  r1...");
	            synchronized (r2) {
	               System.out.println("t1: Holding  r1 & r2...");
	            }
	         }
	      }
	   }
	  static class Thread2 extends Thread {
	      public void run() {
	         synchronized (r2) {
	            System.out.println("t2: Holding  r2...");
	            synchronized (r1) {
	               System.out.println("t2: Holding r1 & r2...");
	            }
	         }
	      }
	   } 
	}