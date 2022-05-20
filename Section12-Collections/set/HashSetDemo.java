import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(null);


        Set<String> names = new TreeSet<>();
        names.add("Adrian");
        names.add("Was");
        names.add("By");
        names.add("The");
        names.add("Door");

        Iterator namesItr = names.iterator();

        while(namesItr.hasNext()){
            System.out.println(namesItr.next());
        }


        // Iterator num = numbers.iterator();
        // while(num.hasNext()){
        //     System.out.println(num.next());
        // }


        // System.out.println(numbers);

    }
}
