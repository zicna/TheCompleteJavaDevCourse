import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> nodes = new LinkedList<>();

        nodes.add("First");
        nodes.add("Second");
        nodes.add("Third");
        nodes.add("Forth");
        nodes.add("Fyfth");

        System.out.println(nodes.removeLast());
        String a = nodes.getFirst();

        System.out.println(a);

        System.out.println(nodes);
    }
    
}
