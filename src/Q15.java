public class Q15 {
    public static void main(String[] args) {
        int [] numbers= {1,2,3,4,5,6,7,8,9,10};
        int even=0,odd=0;

        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%2==0)
                even++;
            else
                odd++;
        }

        System.out.print("Even Number:"+even);
        System.out.println("Odd Number:"+odd);
    }
}
