public class Main{
    public static void main(String[] args) {
        
        // * option one
        // * 1. we are passing an object as argument
        // * 2. we are calling a method on object passed
        Cat cat = new Cat();
        cat.print();
        printThing(cat);
        // ***********************************************************
        
        // * option two
        // * 1. we pass implementation of 'print' method as an object
        printThing(() -> System.out.println("meaow"));

        // * since we are passing lambda expression into a method that expects 'Printable' object
        // * we can save that implementation as an variable of 'Printable' type. 
        Printable lambdaPrintable = () -> System.out.println("meaow");
        printThing(lambdaPrintable);

        // ! lambda expression with arguments
        PrintableWithArgs lambdaArgs = (s) -> System.out.println("Meow " + s);
        printWithArg(lambdaArgs);
    }

    static void printWithArg(PrintableWithArgs thing){
        thing.printArgs("!");
    }



    static void printThing(Printable thing){
        thing.print();
    }

    // * using generic method
    // static  <T extends Printable> void printThing(T thing){
    //     thing.print();
    // }
}