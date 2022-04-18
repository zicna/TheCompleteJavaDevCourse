package models;

import java.util.Objects;

public class Pants extends Product implements Discountable{
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

    @Override
    public void discount() {
        super.setPrice(super.getPrice() / 2);
    }

    @Override
    public void fold() {
        System.out.println(".....");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(!(obj instanceof Pants)){
            return false;
        }

        Pants pants = (Pants)obj;
        return this.getWaist() == pants.getWaist() &&
            super.getBrand().equals(pants.getBrand()) &&
            super.getColor().equals(pants.getColor()) &&
            super.getPrice() == pants.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getWaist(), super.getBrand(), this.getColor(), super.getPrice());
    }



}