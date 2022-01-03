//Time Converter Program
import java.text.*;
import java.util.Date;
class Program4{
   public static void main(String [] args){
       try {
            SimpleDateFormat time= new SimpleDateFormat("hh:mm:ss a");
            String userInput= "12:01:00 AM";
            Date date = time.parse(userInput);
            SimpleDateFormat displayTime = new SimpleDateFormat("HH:mm:ss");
            userInput = displayTime.format(date);
            System.out.println("The required time format is : " + userInput);
           } 
	catch (Exception e) {
	 System.out.println(e);
	}
      }
}
OUTPUT-
The required time format is : 00:01:00