package models;

public class Pants extends Product{
    private int waist;

    public Pants(int waist, double price, String color,String brand ){
        super(price, color, brand);
        this.waist = waist;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }



}