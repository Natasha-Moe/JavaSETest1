public class Q21 {
    public static void main(String[] args) {
        int a=0,b=1,c=2;
        for(int i=2;i<10;i++){
            c=a+b;
            System.out.print("Fibonacci Number Series:"+c);
            a=b;
            b=c;
        }
    }
}
