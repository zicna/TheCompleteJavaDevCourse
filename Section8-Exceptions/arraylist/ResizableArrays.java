import java.util.ArrayList;

public class ResizableArrays{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Joe");
        names.add("Jim");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.set(0, "Joe Fresh");
        names.add(3, "Katie");
        names.remove(2);

    }
}