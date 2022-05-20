import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayQueueDemo {
    public static void main(String[] args) {

        Queue<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        Iterator itrNumb = numbers.iterator();
        while(itrNumb.hasNext()){
            System.out.println(itrNumb.next());
        }
    }
}
