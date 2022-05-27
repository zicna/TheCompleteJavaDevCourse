public class Main{
    public static void main(String[] args) {
        Car honda = new Car("black", 4, "Honda", "Accord");
        Car mazda = new Car("black", 4, "Mazda", "6");
        // Car hondaOne = new Car("black", 4, "Honda", "Accord");
        Car sameCar = new Car(honda);

        System.out.println(honda.equals(sameCar));
        System.out.println(honda.equals(mazda));

    }
}