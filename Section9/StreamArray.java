import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class StreamArray{
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6};

        // return all nmbers bigger than 3
        Arrays.stream(numbers)
            .filter(number -> number > 3)
            .forEach(number -> System.out.println(number));
            
        System.out.println("hello");
    }
}