public class Item{

    private String name;
    private double price;
    private int quantity;

    Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    Item(Item source){
        this.name= source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity; 
    }

    public String toString(){
        return (this.name + ": " + this.price + " (" + (this.quantity) + ")");
    }
}