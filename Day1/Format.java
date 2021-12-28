import java.util.Scanner;
import java.util.Formatter;

public class Format
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("==================================================");
System.out.println("Enter the details:");
for(int i=0;i<3;i++)
{
String s=sc.next();
int x=sc.nextInt();
String a=String.format("%03d",x);

System.out.println(s +"\t"+a);
}
System.out.println("==================================================");

}
}


OUTPUT-
==================================================
Enter the details:

java 100 python 65 cpp 95
java    100
python  065
cpp     095
==================================================