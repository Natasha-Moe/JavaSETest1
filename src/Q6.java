public class Q6 {
    public static void main(String[] args) {
        String day="monday";
        String ans=" is weekday.";

        switch(day){
            case "monday":
                System.out.println(day+ans);
                break;

            case "tuesday":
                System.out.println(day+ans);
                break;

            case "wednesday":
                System.out.println(day+ans);
                break;

            case "thursday":
                System.out.println(day+ans);
                break;

            case "friday":
                System.out.println(day+ans);
                break;

            default:
                System.out.println("Weekend");
        }
    }
}
