import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {

    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;
    static double result = 0;

    public static void main(String[] args) {

        Callable<Double> callable = () -> generateNumber();
        FutureTask<Double> future = new FutureTask<>(callable);
        Thread threadTwo = new Thread(future);
        threadTwo.start();
        double precision = difference(result);

        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter your name to generate a number: ");
        scan.nextLine();
        scan.close();

        try {
            result = future.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + precision);
    }

    /**
     * Function name: generateNumber
     * @return double
     * 
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     * 
     */

     public static double generateNumber(){
         double number = Math.random();
         double difference = difference(number);

         while(difference > PRECISION){
             number = Math.random();
             difference = difference(number);
         }
         return number;
     }

     public static double difference(double number){
         return Math.abs(TARGET - number);
     }
}
