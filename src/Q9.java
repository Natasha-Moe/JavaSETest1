public class Q9 {
    public static void main(String[] args) {
        int[] array={5,10,15,20,25};
        int num=10;
        int index=-5;

        for(int i=0;i< array.length;i++){
            if(array[i]==num){
                index=i;
                break;
            }
        }
        System.out.print("Index Number:\t"+index);
    }
}
