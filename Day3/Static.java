import java.util.*;
class Static
{
static int b,h;
static int area;
static
{
Scanner sc=new Scanner(System.in);
 b=sc.nextInt();
h=sc.nextInt();
if(b>0 && h>0)
           {
            if(b<101 && h<101)
             {
	       area=b*h;
              System.out.println("Area of parallelogram:"+area);
             }
	    else
	     {
              System.out.println("Out of range");
	     }
	    
           }
         
        else
        {
         System.out.println("Breadth and Height must be positive");
        }
}
    
public static void main(String args[])
{
System.out.println(Static.area);
}
}



OUTPUT-1:
1
3
Area of parallelogram:3
3

OUTPUT-2:
-1
200
Breadth and Height must be positive
0