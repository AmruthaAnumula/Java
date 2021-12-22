public class Pattern8 {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print(k+" ");
            }
            System.out.println( );
        }
    } 
}
OUTPUT-
     5 
    4 5 
   3 4 5
  2 3 4 5
 1 2 3 4 5
