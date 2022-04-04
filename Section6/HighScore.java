public class HighScore{
    public static void main(String[] args) {

        int[] scores = {randomInt(), randomInt(), randomInt(), randomInt(), randomInt(), randomInt(), randomInt(), randomInt(), randomInt(), randomInt(), randomInt()};

        for(int i = 0; i < scores.length; i++){
            System.out.print(" " + scores[i]);
        }

        int highScore = 0;
        int possition = 0;

        for(int i = 0; i < scores.length; i++){
            if(highScore < scores[i]){
                highScore = scores[i];
                possition = i;
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ".\n It's the gentlemen in seat: " + possition + " Give that man a cookie!");
        
    }

    public static int randomInt(){
        return (int)(Math.random() * 5001); // this should include zero up to 5000 => [0, 5000]
    }
}