import java.util.Arrays;

public class ReferenceTrap{
    public static void main(String[] args) {

        String[] emplyeesLastYear = {"Milan", "Zicko", "Zile"};
        String[] emplyeesThisYear = emplyeesLastYear;

        System.out.println(Arrays.toString((emplyeesLastYear)));
        System.out.println(Arrays.toString((emplyeesThisYear)));
        
        emplyeesLastYear[0] = "Zivkovic";

        System.out.println(Arrays.toString((emplyeesLastYear)));
        System.out.println(Arrays.toString((emplyeesThisYear)));
        
        // * the right way to do it
        // Option 1. for loop to copy each element
        // option 2. use Arrays.copyOf
        String[] rightEmp = Arrays.copyOf(emplyeesLastYear, emplyeesLastYear.length);

        System.out.println(Arrays.toString(rightEmp));
        rightEmp[0] = "Bojana";
        System.out.println(Arrays.toString(rightEmp));
        System.out.println(Arrays.toString(emplyeesLastYear));
    }
}