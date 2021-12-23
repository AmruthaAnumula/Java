public class Method8 {
    public static void main(String args[]){
        String str1="Welcome";
        String str2="Welcome";
        System.out.println(str1.concat(" ").concat(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
    
}
OUTPUT-
Welcome Welcome
-1397214398
-1397214398



2.
public class Method8 {
    public static void main(String args[]){
        String str1="Welcome";
        String str2="to java";
        System.out.println(str1.concat(" ").concat(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }  
}

OUTPUT-
Welcome to java
-1397214398
-1213112153
