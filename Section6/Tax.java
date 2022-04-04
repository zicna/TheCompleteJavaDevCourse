import java.util.Arrays;

public class Tax{
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        double[] afterTax= new double[price.length] ;

        for(int i = 0; i < price.length; i++){
            afterTax[i] = price[i] * 1.13;
            System.out.println("The original prices are: " + price[i]);
            System.out.println("The prices after tax are: " + afterTax[i]);
            System.out.println("Only on two deciamls (not rounding) " + (Math.floor(afterTax[i] * 100) / 100));
        }

        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(afterTax));
    }
}