import java.util.Scanner;

public class CountingTool{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi Timmy! Chosse a number to count to: ");
        int number = scan.nextInt();
        System.out.println("Great! Here's how it's done");
        for(int i = 0; i <= number; i++){
            System.out.print(i + " ");
        }

        scan.close();
    }
}