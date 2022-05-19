package annotations.src.main;
public class IlTax{
    double saleTax = 1.1;
    
    public double priceWithTax(double price){
        return price * saleTax;
    }
}