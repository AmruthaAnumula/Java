import java.util.*;
public class Prime {
    public static void main(String args[]){
        int temp=0;   
        for(int i=2;i<=100;i++){           
          for(int j=2;j<=i-1;j++){
            if(i%j==0){
                temp=temp+1;
            }
        }
    
        if(temp==0){
            System.out.println(i);
        }
        else{
            temp=0;
        }
     }
   }
}
OUTPUT-
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97



