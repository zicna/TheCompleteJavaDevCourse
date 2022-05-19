import java.util.Arrays;

public class Weather{
    public static void main(String[] args) {
        double[] celisius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celisius);

        printTemperatures("Celisius", celisius);
        printTemperatures("Fahrenheit", fahrenheit);
    }

    public static double[]  celsiusToFahrenheit(double[] cel){
        double[] fahr = new double[cel.length];
        for(int i = 0; i < cel.length; i++){
            fahr[i] = celToFahr(cel[i]);
        }
        return fahr;
    }

    public static double celToFahr(double cel){
        // temp var will store double * 100 F temperature without decimal part
        // int temp = (int)(((cel/5 * 9) + 32) * 100); 
        //we take temp(integer) divide it with 100 and return double as two decimal spaces rounded value
        // return (double)temp / 100;  

        return (cel/5 * 9) + 32;
    }

    // public static void printTemperatures(double[] cel, double[] fahr){
    //     System.out.print("Temp in celisius are: " + Arrays.toString(cel) + "\n");
    //     System.out.println("Temp in fahrenheit are: " + Arrays.toString(fahr));
    // }

    public static void printTemperatures(String type, double[] temp){
        System.out.println(type + ": ");
        for(int i = 0; i < temp.length; i++){
            System.out.println(String.format("%.2f", temp[i]));
        }
        System.out.println("\n");
    }   
}