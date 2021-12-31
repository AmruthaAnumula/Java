//EXCEPTION HANDLING WITH METHOD OVERRIDING
/*1.If the superclass method doesn't declare an exception,subclass overridden method cannot declare the checked excception.*/
class Test{
	void msg(){
	System.out.println("Test method is executing.");
	}
}
public class Program5 extends Test{
 	void msg()throws Exception{
	 System.out.println("child method is executing.");
	}
 public static void main(String args[]){
	Test t1=new Program5();
	t1.msg();
}
}
OUTPUT-
 msg() in Program5 cannot override msg() in Test
        void msg()throws Exception{
             ^
  overridden method does not throw Exception

/*2.If the superclass method doesn't declare an exception,the subclass overridden method cannot declare the checked exception,but can declare an unchecked exception.*/
class Test{
	void msg(){
	System.out.println("Test method is executing.");
	}
}
public class Program6 extends Test{
 	void msg()throws ArithmeticException{
	 System.out.println("child method is executing.");
	}
 public static void main(String args[]){
	Test t1=new Program6();
	t1.msg();
}
}
OUTPUT-
child method is executing.
