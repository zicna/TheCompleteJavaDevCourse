import java.util.stream.Stream;

public class StreamReduction{
    public static void main(String[] args) {
        streamReduce();
    }

    public static void streamReduce(){
        // * create double stream using stream of function

        double total = Stream.of(7.6, 9.4, 3.6, 6.7)
            .reduce(0.0, (Double a, Double b) -> a + b);
            System.out.print("Total =  " + total);
    }
}