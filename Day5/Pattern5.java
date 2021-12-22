public class Pattern5 {
    public static void main(String args[]){
      int n=65;
      for(int i=0,p=0;i<5;i++,p++){//Rows
         for(int j=0;j<=i;j++){//Column
             System.out.print((char)(n+p)+" ");
   }
   System.out.println( );
  }
 }
}
OUTPUT-
A 
B B       
C C C     
D D D D   
E E E E E 
