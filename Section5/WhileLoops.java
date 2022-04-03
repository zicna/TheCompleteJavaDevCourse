public class WhileLoops{
    public static void main(String[] args) {
        // int number = 25;
        // while(number <= 30){
        //     System.out.println(++number);
        // }

        double choice = 0.01;
        double quess = 0.99;

        while(quess > choice){
            quess = Math.random();
            System.out.println(quess);
        }
        
    }
}