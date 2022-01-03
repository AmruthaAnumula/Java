import java.util.*;
class File{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
try{
        while (sc.hasNextLine()) {
		String str1= sc.nextLine();
		String str2= sc.nextLine();
		String str3= sc.nextLine();
	System.out.println("1."+" "+str1);
	System.out.println("2."+" "+str2);
        System.out.println("3."+" "+str3);
	break;
	}
}
catch(Exception e){
    System.out.println(e);
}
finally{
      sc.close(); 
   } 
 }
}
OUTPUT-
Hello World
I am a file
Read me until end-of-file
1. Hello World
2. I am a file
3. Read me until end-of-file
