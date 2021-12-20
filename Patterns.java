1
class Pattern
{
public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   System.out.println();
  }
 }
}
OUTPUT-
1
12
123
1234
12345

2
class Pattern
{
public static void main(String args[])
 {
  int n=65;
  for(int i=1;i<=5;i++)
  {
   for(int j=0;j<=i;j++)
   {
    System.out.print((char)(n+j));
   }
   System.out.println();
  }
 }
}
OUTPUT-
AB
ABC
ABCD
ABCDE
ABCDEF

3
class Pattern
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=i;j++)
    {
     System.out.print("*");
    }
    System.out.println();
  }
 }
}

OUTPUT-
*
**
***
****
*****

4
class Pattern
{
 public static void main(String args[])
 {
  int n=65;
  for(int i=0;i<5;i++)
  {
   for(int j=0;j<=i;j++)
   {
    System.out.print((char)(n+j));
   }
   System.out.println();
  }
 }
}

OUTPUT-
A
AB
ABC
ABCD
ABCDE
 
5
class Pattern
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1,p=1;i<=n;i++,p++)
  {
  
    for(int j=1;j<=i;j++)
    {
     System.out.print(p+" ");
    }
   System.out.println();
  }
 }
}

OUTPUT-
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

6
class Pattern
{
 public static void main(String args[])
 {
  int n=65;
  for(int i=0,p=0;i<5;i++,p++)//Rows
  {
   for(int j=0;j<=i;j++)//Columns
   {
    System.out.print((char)(n+p));//p is used to print the same value in that row
   }
   System.out.println( );
  }
 }
}

OUTPUT-
A
BB
CCC
DDDD
EEEEE

7
class Pattern
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)//Rows
  {
   for(int j=i;j<=n;j++)//for loop for spaces
   {
    System.out.print(" ");
   }
   for(int k=1;k<=i;k++)//for loop to print the *
   {
    System.out.print("*");
   }
   System.out.println( );
  }
 }
}
  
OUTPUT-
     *
    **
   ***
  ****
 *****

8
class Pattern
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)//Rows
  {
   for(int j=i;j<=n;j++)
   {
   System.out.print(" ");
   }
   for(int k=1;k<=i;k++)
   {
   System.out.print(k+" ");
   }
   System.out.println();
  }
 }
}

OUTPUT-
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5

9
class Pattern
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=1;i<=n;i++)//Rows
  {
   for(int j=1;j<=i;j++)
   {
   System.out.print(" ");
   }
   for(int k=5;k>=i;k--)
   {
   System.out.print(k+" ");
   }
   System.out.println();
  }
 }
}

OUTPUT-
 5 4 3 2 1
  5 4 3 2
   5 4 3
    5 4
     5

10
class Pattern
{
 public static void main(String args[])
 {
 int n=5;
  for(int i=1,p=69;i<=n;i++,p--)
  {  
   
   for(int j=1;j<=i;j++)
   {
    System.out.print((char)(p)+" ");
   }
  System.out.println();
  }
}
}

OUTPUT-
E
D D
C C C
B B B B
A A A A A

11
class Pattern
{
 public static void main(String args[])
 {
 int n=5;
 for(int i=1;i<=n;i++)
  {
   for(int j=i;j<=n;j++)
   {
    System.out.print(" ");
    }
   for(int k=1;k<i;k++)
   {
   System.out.print("*");
   }
   for(int l=1;l<=i;l++)
   {
   System.out.print("*");
   }
   System.out.println();
  }
}
}


OUTPUT-
     *
    ***
   *****
  *******
 *********
  
12
class Pattern
{
 public static void main(String args[])
 {
 int n=5;
 for(int i=1,p=1;i<=n;i++)
 {
  for(int j=1;j<=i;j++)
  {
  System.out.print(p+++" " );
  
  }
 System.out.println();
 }
}
}
OUTPUT-
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


