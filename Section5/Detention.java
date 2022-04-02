import java.util.Scanner;

public class Detention{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you. \n What do you want me to write?");
        String sentence = scan.nextLine();

        for(int i = 0; i < 99; i++){
            System.out.println( (i +1) + ". " + sentence);
        }

        scan.close();

    }
}