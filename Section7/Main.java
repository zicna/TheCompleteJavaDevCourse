import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};

        Car[] cars = new Car[]{
            new Car("Nissan", 5000, 2022, "red", parts),
            new Car("Dodge", 8500, 2019, "blue", parts),
            new Car("Nissan", 5000, 2022, "red", new String[]{"tires", "filter"})
        };
        // Car nissan = new Car("Nissan", 5000, 2022, "red", parts);
        // Car dodge = new Car("Dodge", 8500, 2019, "blue", parts);
        // Car nissanOne = new Car(nissan);

        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        System.out.println(dealership.getCar(0));
    }
} 