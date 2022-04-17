package models;

import java.util.Objects;

public class Shirt extends Product{
    private String size;

    public Shirt(String size, double price, String color, String brand ){
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source){
        super(source);
        this.size = source.size;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(!(obj instanceof Shirt)){
            return false;
        }

        Shirt shirt = (Shirt)obj;

        return this.getSize().equals(shirt.getSize()) && 
                super.getBrand().equals(shirt.getBrand()) &&
                super.getColor().equals(shirt.getColor()) &&
                super.getPrice() == shirt.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getSize(), super.getBrand(), super.getColor(), super.getPrice() );
    }


}