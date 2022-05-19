package two.src.main;

public class Grader {

    public char determineLetterGrade(int numberGrade){
        if(numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot be less than zero.");
        } else if(numberGrade < 60){
            return 'F';
        }else if(numberGrade < 70){
            return 'D';
        }else if(numberGrade < 80){
            return 'C';
        }else if(numberGrade < 90){
            return 'B';
        }else{
            return 'A';
        }
    }
}
