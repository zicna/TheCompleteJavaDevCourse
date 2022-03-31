public class ReturnValues{
    public static void main(String[] args) {
        double measureOne = mesureRactangle(3.3, 4.3);
        double measureTwo = mesureRactangle(3.5, 6.7);
        double measureThree = mesureRactangle(4.7, 2.3);
        double measureFor = mesureRactangle(4.3, 8.9);
        double measureFive = mesureRactangle(1.2, 4.5);

        stringPrinter(3.3, 4.3, measureOne);
        stringPrinter(3.5, 6.7, measureTwo);
        stringPrinter(4.7, 2.3, measureThree);
        stringPrinter(4.3, 8.9, measureFor);
        stringPrinter(1.2, 4.5, measureFive);
        
    }

    public static double mesureRactangle(double length, double width){
        double area = length * width;
        return area;
    }

    public static void stringPrinter(double length, double width, double area){
        System.out.println("The area of a ractangle with length " + length + " and width " + width + " is equal to " + area + "\n");
    }
}