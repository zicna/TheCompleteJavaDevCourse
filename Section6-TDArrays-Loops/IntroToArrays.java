public class IntroToArrays{
    public static void main(String[] args) {
        int[] integers = {1, 2, 3};
        String[] kingdoms = {"Mercia", "Wessex", "Northhumbria", "E A"};
        System.out.println(kingdoms); // prints reference to tha array

        System.out.println(kingdoms.length);

        for(int i =0; i < kingdoms.length; i++){
            System.out.println(kingdoms[i]);
        }
    }
}