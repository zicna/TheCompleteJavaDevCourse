public class LogicalOperators{
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;

        if(chemistryGrade > 75 || englishGrade > 75){
            System.out.println("Congratualitions, you got the scolarship!");
        }else{
            System.out.println("You did not get our scholarship");
        }

        int credits = 56;
        double GPA = 3.2;

        if(credits >= 40 && GPA >= 2.0){
            System.out.println("You earnd your diploma!");
        }else{
            System.out.println("Sorry, you didn't earn your diploma!");
        }
    }
}