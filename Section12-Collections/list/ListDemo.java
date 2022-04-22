package list;
import java.util.ArrayList;
import java.util.Iterator;

//* Same implementation is for all classes that extends List interface

public class ListDemo{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("John");
        list1.add("Betty");
        list1.add("Adam");
        list1.add("Jack");
        list1.add("Janny");
        list1.add("Mike");

        //* 1. get element form ArrayList
        System.out.println(list1.get(0));

        //* 2. add element form ArrayList
        list1.add("Zicko");
        //System.out.println(list1.get(list1.size())); //! java.lang.IndexOutOfBoundsException
        System.out.println(list1.get(list1.size() -1)); 

        //* 3. remove element form ArrayList
        System.out.println(list1.get(0));
        list1.remove(0);
        System.out.println(list1.get(0));

        //* 4. iterate with for-each loop (provided by Iterable interface)
        System.out.println("======== Iterating using Iterable Enchanced ForLoop =========");
        for (String name : list1) {         
            System.out.println(name);
        }
        System.out.println("================================================");


        //* 5. iterate using Iterator API
        System.out.println("======== Iterating using Iterator API =========");
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("================================================");
        
    }
}