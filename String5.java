import java.util.*;
import java.io.*;
class String5
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt( );
  boolean isPrime=true;
  if(n==0 || n==1)
  { 
    isPrime=false;
  }
   else
  {
    for(int i=2;i<n;i++)
    {
    if(n%i==0)
     {
      isPrime=false;
     }
    }
  }
  if(isPrime)//1
  {
    System.out.println("Prime number");
  }
  else 
  {
    System.out.println("Not a prime number");
  } 
 }
}
OUTPUT-
0
Not a prime number

1
Not a prime number


23
Prime number


33
Not a prime number


29
Prime number


100
Not a prime number

