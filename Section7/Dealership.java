import java.lang.reflect.Array;
import java.util.Arrays;

public class Dealership{
     private Car[] cars;

    //  public Dealership(Car[] cars){
    //      this.cars = Arrays.copyOf(cars, cars.length);
    //  }
     public Dealership(){
       this.cars = new Car[3];
    //    System.out.println(Arrays.toString(this.cars));
    }

    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index){
        return new Car(this.cars[index]);
    }

    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String search(String make, int budget){
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i] == null){
                continue;
            }else if(make.equals(this.cars[i].getMake()) && this.cars[i].getPrice() <= budget){
                return "we found one one spot " + i + "\n" + this.cars[i].toString();
            }
        }
        return "Sorry, we can't find any";

    }

    public String toString(){
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking spots " + i + "\n";
            if(this.cars[i] == null){
                temp += "Empty for that spot";
            }else{
                temp += this.cars[i].toString() + "\n";
            }
        }

        return temp;
    }

}