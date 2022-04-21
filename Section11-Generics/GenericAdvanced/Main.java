// import java.util.ArrayList;

public class Main{
public static void main(String[] args) {
    // ArrayList animals = new ArrayList ();  
    Cat myTiger = new Cat("Pantera", "Tigris", "Sir-Kan", 3, "miiijaaaauuu" );
    Dog myWolf = new Dog("Lupus", "Candidae", "Beli ocnjak", 4, "auuuuufuuf" );

    Printer<Dog> myPrinter = new Printer<Dog>(myWolf);
    myPrinter.print();
    }
}