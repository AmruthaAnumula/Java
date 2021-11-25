
import java.util.Scanner;

class Stdinout
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
double d=sc.nextDouble();
String s1=sc.nextLine();
System.out.println("String:"+s1);
System.out.println("Double:"+d);
System.out.println("Integer:"+x);
}
}

Input-
42 3.1415 Happy Learning...!
Output-
String: Happy Learning...!
Double:3.1415
Integer:42