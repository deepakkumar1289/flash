package com.deepak;

import java.util.Scanner;
class Floyd{
   public static void main(String args[]){
      int count =1;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows of floyd's triangle you want");
      int n = in.nextInt();
      System.out.println("Floyd's triangle :-");
      for (int i = 1 ; i <= n ; i++ )
      {
         for (int j = 1 ; j <= i ; j++ )
           {
              System.out.print(count+" ");
              count++;
           }
          System.out.println();
      }
   }
}