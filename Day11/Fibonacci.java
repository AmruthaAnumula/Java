class Fibonacci{
    public static void main(String args[]){
        int first=1;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        int third;
        int n=10;
        for(int i=3;i<=10;i++){
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
}
OUTPUT-
1 1 2 3 5 8 13 21 34 55 