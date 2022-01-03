//Splitting the string
import java.util.*;
class Program1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("The input string is:");
	String str=sc.nextLine();
	String part[]=str.split("[' '',?]");
	for(int i=0;i<part.length;i++){
	System.out.println(part[i]);
        }
	System.out.println("Number of tokens are:"+part.length);
 }
}
OUTPUT-
The input string is:
He is a very very good boy,isn't he?
He
is
a
very
very
good
boy
isn
t
he
Number of tokens are:10