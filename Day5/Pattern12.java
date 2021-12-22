public class Pattern12 {
    public static void main(String args[]){
        int n=5;
        for(int i=1,p=1;i<=n;i++,p++){
          for(int j=i;j<=n;j++){
            System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print(p+" ");
    }
    System.out.println( );
}
    }
}
OUTPUT-
     1 
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5