public class Pattern6 {
    public static void main(String args[]){
     int n=5;
     for(int i=1;i<=n;i++){//Rows
      for(int j=i;j<n;j++){//for loop for spaces
        System.out.print("  ");
     }
      for(int k=1;k<=i;k++){//for loop to print the *
       System.out.print("* ");
     }
   System.out.println( );
  }
 }  
}
OUTPUT-
        * 
      * *
    * * *
  * * * *
* * * * *
