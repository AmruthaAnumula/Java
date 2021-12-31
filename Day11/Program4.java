//EXCEPTION HANDLING-USING THROWS KEYWORD
class Program4{
	public static void execute()throws Exception{
	throw new Exception("Execution Failed");
	}
	public static void main(String args[])throws Exception{
	String s=null;
	try{
	System.out.println(s.length());
	}
	catch(Exception e){
	Program4.execute();
	}
   }
}
OUTPUT-
Exception in thread "main" java.lang.Exception: Execution Failed
        at Program4.execute(Program4.java:4)
        at Program4.main(Program4.java:12)
