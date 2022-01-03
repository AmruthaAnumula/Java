import java.util.*;
import java.text.*;
class Currency{
	public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 double payment=sc.nextDouble();
	 sc.close();
NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
NumberFormat franceFormat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
	String us=usFormat.format(payment);	
	String india=indiaFormat.format(payment);	
	String china=chinaFormat.format(payment);	
	String france=franceFormat.format(payment);	
	System.out.println("US:"+us);
	System.out.println("INDIA:"+india);
	System.out.println("CHINA:"+china);
	System.out.println("FRANCE:"+france);
	}
}
OUTPUT-
12324.134
US:$12,324.13
INDIA:?12,324.13
CHINA:¥12,324.13
FRANCE:12?324,13 ?