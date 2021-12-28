import java.util.*;
class ArraySorting{
    static void sort(int[] arr){
        int count=0;
        System.out.println("Array before Sorting:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){//count of zero's
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println("Array after sorting :"+Arrays.toString(arr));
    }
            public static void main(String args[]){
               int[] arr={0,1,0,0,1};
               sort(arr);
              
            }

}
OUTPUT-
Array before Sorting:[0, 1, 0, 0, 1]
Array after sorting :[0, 0, 0, 1, 1]
    
