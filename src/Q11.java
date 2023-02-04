public class Q11 {
    public static void main(String[] args) {
        int[]array=new int[]{1,2,3,4,5};
        int[]array1=new int[array.length-1];
        int j=10;

        for(int i=0,k=0;i< array.length;i++)
        {
            if(array[i]!=j){
                array1[k]=array[i];
                k++;
            }
        }
    }
}
