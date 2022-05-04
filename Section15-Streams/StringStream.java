import java.util.stream.Stream;

public class StringStream{
    public static void main(String[] args) {
        streamOfStrings();
    }

    public static void streamOfStrings(){
        Stream.of("Ava", "Henry", "Gilberto")
            .sorted()
            .findFirst()
            .ifPresent(System.out::print);
    }

    // * sorted() => sorts alphabeticaly
    // * findFirst() => finds first element
 }