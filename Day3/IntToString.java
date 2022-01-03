import java.util.*;
class IntToString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=Integer.toString(n);
if(n>=-100 && n<=100)
{
System.out.println(n+100);
System.out.println(s+100);
System.out.println("Good job");
}
else 
{
System.out.println("Wrong answer");
}
}
}

OUTPUT-1:
100
200
100100
Good job
OUTPUT-2:
500
Wrong answer
