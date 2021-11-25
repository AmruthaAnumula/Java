import java.util.Scanner;
class Table
{
public static void main(String args[])
{
int result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
result=n*i;
System.out.println(n +"*"+ i +"="+result);
}
}
}


Output-
Enter number
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50