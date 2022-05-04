import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStream{
    public static void main(String[] args) {
        stringArray();

        intArray();

        listArray();
    }
    // * 1. String Arrays
    public static void stringArray(){
        String [] names = {"Ali", "Dali", "Bali", "Cali", "Vali", "Alberto", "Adriano", "Alex", "Anelka"};
        
        Arrays.stream(names)
        .filter(x -> x.startsWith("A"))
        .sorted()
        .forEach(x -> System.out.println("Hello " + x + "."));
    }
    
    // * 2. Integer  Arrays
    public static void intArray(){
        int[] numbers = {2, 4, 6, 8, 10};
        Arrays.stream(numbers)
            .map(x -> x * x)
            .average()
            .ifPresent(System.out::print);
    }

    // * 3. Stream for List
    public static void listArray(){
        //* create new list as fixed size list
        List<String> people = Arrays.asList("Ali", "Dali", "Bali", "Cali", "Vali", "Alberto", "Adriano", "Alex", "Anelka");

        //* create list as ArrayListfixed size list
        // List<String> peopleOne = new ArrayList<>();
        // peopleOne.add("Ali");

        people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);

    }


}