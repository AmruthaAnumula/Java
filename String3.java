import java.io.*;
import java.util.*;
class String3
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String a=sc.nextLine();
  String b=sc.nextLine();
  if(isAnagram(a,b))
  {
    System.out.println("True-They are Anagrams");
  }
  else
  {
   System.out.println("False-They are not Anagrams");
  }
 }
  public static boolean isAnagram(String a,String b)
  {
   a=a.replaceAll(" ","");
   b=b.replaceAll(" ","");
   if(a.length()!=b.length())
   {
   return false;
   }
   else
   {
   char[]array1=(a.toLowerCase()).toCharArray();
   char[]array2=(b.toLowerCase()).toCharArray();
   Arrays.sort(array1);
   Arrays.sort(array2);
   return(Arrays.equals(array1,array2));
   }
  }
}

OUTPUT-1
anagram
maragan
True-They are Anagrams

OUTPUT-2
Hello
hello
True-They are Anagrams

OUTPUT-3
anagram
maragaan
False-They are not Anagrams
