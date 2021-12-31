//EXCEPTION HANDLING-MULTIPLE CATCH BLOCKS
class Program2{
	public static void main(String args[]){
	String s=null;
	try{
	System.out.println(s.charAt(2));
	}
	catch(ArithmeticException ae){
	System.out.println(ae);
	}
	catch(StringIndexOutOfBoundsException se){
	System.out.println(se);
	}
	catch(NullPointerException ne){
	System.out.println(ne);
	}
	finally{
	System.out.println("Finally block is executed");
	}
  }
}
OUTPUT-
java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local1>" is null
Finally block is executed


