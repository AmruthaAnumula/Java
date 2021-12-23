public class Method12 {
    public static void main(String args[]){
        String str="abcde";
        byte[] bt=str.getBytes();
        for(int i=0;i<bt.length;i++){
            System.out.println(bt[i]);
        }
        String newstring=new String(bt);
        System.out.println(newstring);
        
    }
}
output-
97
98
99
100
101
abcde