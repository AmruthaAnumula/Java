import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileReader;
import java.io.BufferedReader;
class Regex{
 	public static void main(String args[]){
	 final String REGEX_PATTERN="fooa+bar";
	 Pattern p=Pattern.compile(REGEX_PATTERN);
	try{
	  FileReader fr=new FileReader("D:\\Day13\\Data.txt.txt");
	  BufferedReader br=new BufferedReader(fr);
	  String line;
	  while((line = br.readLine()) != null){
	   Matcher m=p.matcher(line);
	   if(m.find()){
	    System.out.println(line);
	    }
	   }
	  }
 	catch(Exception e){
	  System.out.println(e);
	}
	}
}
OUTPUT-
fooaaabar
fooabar
fooaabar
