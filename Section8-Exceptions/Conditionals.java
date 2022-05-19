public class Conditionals{
    // public static void main(String[] args) {
    //     String option = "";

    //     int random = (int) (Math.random() * 3 + 1);
        
    //     switch (random) {
    //         case 1: option = "hit";
    //         break; 
    //         case 2: option = "stay";
    //         break;
    //         case 3: option = "fold";
    //         break;
    //         default: option = "This should never get called";
    //     }
     

    //     if (!option.equals("hit") && !option.equals("stay")) {
    //         System.out.println("fold");
    //     } else {
    //         System.out.println(option); 
    //    } 
    // }

    public static void main(String[] args) {

        int age = 24;
        double debt = 0;

        String creditScore = debt > 0 ? "Bad" : "Good";
        boolean canApply = age > 18;

        if (canApply && creditScore.equals("Good")) {
            System.out.println("We're processing your application");
        } else {
            System.out.println("You cannot apply");
        }

    }
}