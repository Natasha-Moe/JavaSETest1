public class Q19 {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        for (int i = 1; i <= numbers.length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= numbers.length; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
