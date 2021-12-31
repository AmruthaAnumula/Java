//ARITHMETIC EXCEPTION HANDLING
import java.util.*;
class Program1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3;
    try{
 	num3=num1/num2;
	System.out.println("The value of num3 is:"+num3);
	}
   catch(ArithmeticException ae){
	System.out.println(ae);
	}
  }
}
OUTPUT-1:
2
0
java.lang.ArithmeticException: / by zero

OUTPUT-2:
44
12
The value of num3 is:3
