//MATRIX-DIAGONAL PROGRAM
import java.util.*;
class Program5{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of rows:");
	int rows=sc.nextInt();
	System.out.println("Number of columns:");
	int columns=sc.nextInt();
	int[][] matrix=new int[rows][columns];
	System.out.println("Enter the elements:");
	for(int i=0;i<rows;i++){
	 for(int j=0;j<columns;j++){
	     matrix[i][j]=sc.nextInt();
	 }
	}
	System.out.println("The matrix is:");
	for(int i=0;i<rows;i++){
	 for(int j=0;j<columns;j++){
	    System.out.print(matrix[i][j]+" ");
	 }
	 System.out.println( );
	}
	int sum=0,sum1=0;
	for(int i=0;i<rows;i++){
	 for(int j=0;j<columns;j++){
	    if(i==j){
	       sum=sum+matrix[i][j];
	     }
	   if(i==rows-j-1){
	      sum1=sum1+matrix[i][j];
	   }
         }
	}
System.out.println("Absolutre difference between the diagonals:"+Math.abs(sum-sum1));//absolute difference method
}
}
OUTPUT-
Number of rows:
3
Number of columns:
3
Enter the elements:
11
2
4
4
5
6
10
8
-12
The matrix is:
11 2 4
4 5 6
10 8 -12
Absolutre difference between the diagonals:15



