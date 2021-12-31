//EXCEPTION HANDLING-USING THROW KEYWORD
import java.util.Scanner;
class Program3{
	static void valid(int age){
	if(age<18){
	 throw new ArithmeticException("Not eligible to vote");
	}
	else{
	 System.out.println("Eligible to vote");
        }
     }
    public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	valid(age);
 }
}
OUTPUT-1:
22
Eligible to vote

OUTPUT-2:
12
Exception in thread "main" java.lang.ArithmeticException: Not eligible to vote
        at Program3.valid(Program3.java:6)
        at Program3.main(Program3.java:15)