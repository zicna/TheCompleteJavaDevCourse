import java.util.ArrayList;

public class RawCollections{
    public static void main(String[] args) {
        ArrayList items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.add(7);

        printFromCollection(items);

    }

    public static void printFromCollection(ArrayList items){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}

//* Type safety: The method add(Object) belongs to the raw type ArrayList. References to generic type ArrayList<E> should be parameterized