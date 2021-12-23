public class Method2 {
    public static void main(String args[]){
        String str1=String.format("%d",101);
        String str2=String.format("%c",'a');
        String str3=String.format("%e",24.022002);
        String str5=String.format("|%10d|",24);
        String str6=String.format("|%-10d|",24);//Padding Methods
        String str7=String.format("|%010d|",24);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
    }    
}
OUTPUT-
101
a
2.402200e+01
|        24|
|24        |
|0000000024|
