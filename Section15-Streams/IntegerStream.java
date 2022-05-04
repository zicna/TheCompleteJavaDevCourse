import java.util.stream.IntStream;

public class IntegerStream{
    public static void main(String[] args) {
       intStream();
        System.out.println();

        intStreamWithSkip();
        System.out.println();

        intStreamWithSum();
    }
    // * 1. IntStream
    public static void intStream(){
        IntStream
        .range(1, 10)
        .forEach(System.out::print);
    }

    // * 2. IntStream with Skip
    public static void intStreamWithSkip(){
        IntStream
        .range(1, 10)
        .skip(5)
        .forEach(x -> System.out.println(x));
        // * .skip() will skip first 5 elements of our stream
    }
    // * 3. IntStream with sum
    
    public static void intStreamWithSum(){
        int rangeSum = IntStream
        .range(1, 10)
        // .skip(5)
        .sum();
        
        System.out.println(rangeSum);
    }
    
}