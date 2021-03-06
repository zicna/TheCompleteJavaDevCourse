import java.util.ArrayList;

public class ParameterizedCollections {

    public static void main(String[] args) {
        // * option One
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // * option two
        // ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        // numbers.add("Hello");   //* VS Code now shows an error

        print(numbers);
    }

    public static void print(ArrayList<Integer> items){
        for(Integer num : items){
            System.out.println(num * 2);
        }
    }
    
}
