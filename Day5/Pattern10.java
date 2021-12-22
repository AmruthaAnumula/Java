public class Pattern10 {
    public static void main(String args[]){
        int n=65;
        int rows=5;
        for(int i=rows;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=rows;k++){
                System.out.print((char)(n+k-1)+" ");
            }
            System.out.println( );
        }
    }
}
OUTPUT-
    E 
   D E
  C D E 
 B C D E
A B C D E
