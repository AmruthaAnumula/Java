//PROGRAM TO PRINT SOLID PATTERNS

import java.util.*;
class SolidRectangle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
      for(int j=1;j<=5;j++)
      {
       System.out.print("* ");
      }
      System.out.println( );
     }
     sc.close();
  }
}

OUTPUT-
3
* * * * * 
* * * * *
* * * * *