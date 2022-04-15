package main;

import java.text.DecimalFormat;

public class Main{

    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};
    public static void main(String[] args) {
        
    }

    public static double getSubtotal(){
        double temp = 0;
        for (int i = 0; i < prices.length; i++) {
            temp += prices[i];
        }
        return temp;
    }

    public static double getTax(double subtotal){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(subtotal * 0.13));
    }

    public static double getTotal(double subtotal, double tax){
        return subtotal + tax;
    }



}