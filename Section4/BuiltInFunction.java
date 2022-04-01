public class BuiltInFunction{
    public static void main(String[] args) {
        System.out.println("Hello Java");

        double sine = Math.sin(1.2);
        System.out.println("The sin of 1.2 is: " + sine);

        double power = Math.pow(2, 64);
        System.out.println(power);

        double random = Math.random();
        System.out.println(random);

        double random100 = Math.random() * 100;
        System.out.println(random100);
    }
}