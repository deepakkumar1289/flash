package com.deepak;

class Palindrome{
public static void main(String as[]){
int n=123;
int ncopy=n;
int rev=0;
while(n!=0){
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(ncopy==rev)
System.out.println(ncopy+" is palindrome");
else
System.out.println(ncopy+" is not palindrome");
}
}
