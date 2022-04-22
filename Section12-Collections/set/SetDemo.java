import java.util.HashSet;
import java.util.Iterator;

public class SetDemo{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("John");
        set.add("Betty");
        set.add("Adam");
        set.add("Adam");
        set.add("Jack");
        set.add("Janny");
        set.add("Janny");
        set.add("Mike");
        set.add("Mike");

        // * data is unique, no redundency
        // * data is unorderd due to hashing

        Iterator<String> names = set.iterator();

        while(names.hasNext()){
            System.out.println(names.next());
        }

        System.out.println(set.contains("Jack"));
        set.remove("Jack");
        System.out.println(set.contains("Jack"));
    }
}