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

}