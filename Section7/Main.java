import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};

        Car nissan = new Car("Nissan", 5000, 2022, "red", parts);

        Car nissanOne = new Car(nissan);

        Car dodge = new Car("Dodge", 8500, 2019, "blue", parts);

        nissan.setColor("black");
        dodge.setColor("black");

        nissanOne.setParts(new String[] {"filter"});

        nissan.setPrice(nissan.getPrice() / 2);

        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println(nissan.getColor());

        System.out.println(nissanOne.getColor());

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n" );
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n" );
        
        System.out.println(Arrays.toString(nissan.getParts()));
        System.out.println(Arrays.toString(nissanOne.getParts()));

        // System.out.println(nissanOne.getParts());
    }
} 