public class Q13 {
    public static void main(String[] args) {
        int[]randArray={1,2,5,6,7,10,7,8};

        for(int i=0;i<randArray.length;i++)
        {
            for(int j=i+1;j< randArray.length;j++)
            {
                if(( randArray[i]== randArray[j] && (i!=j)))
                {
                    System.out.println("Duplicate Number:"+randArray[j]);
                }
            }
        }
    }
}
