public class ReturnValues{
    public static void main(String[] args) {
        double measureOne = mesureRactangle(-1, 4.3, "area");
        double measureTwo = mesureRactangle(3.5, 6.7, "perimeter");
        

        stringPrinter(3.3, 4.3, measureOne, "area");
        stringPrinter(3.5, 6.7, measureTwo, "perimeter");
        
        
    }

    public static double mesureRactangle(double length, double width, String option){
        // double area = length * width;
        // return area;
        if(length < 0 || width < 0){
            System.out.println("length or width can not be negative");
            System.exit();

        }
        switch(option){
            case "area": return length * width;
            case "perimeter" : return 2 *(length + width);
            default: return 404;
        }
    }

    public static void stringPrinter(double length, double width, double measure, String option){
        System.out.println("The "+option+" of a ractangle with length " + length + " and width " + width + " is equal to " + measure + "\n");
    }
}