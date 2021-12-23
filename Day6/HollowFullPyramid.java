import java.util.*;
public class HollowFullPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==1 || k==1 || i==k || k==n || i==n){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }

    }
    
}

OUTPUT-
5
     1 
    1 2
   1   3
  1     4
 1 2 3 4 5 
