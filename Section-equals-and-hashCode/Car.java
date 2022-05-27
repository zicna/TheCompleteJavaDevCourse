import java.util.Objects;

public class Car{

    private String color;
    private int doorNum;
    private String make;
    private String model;

    public Car(String color, int doorNum, String make, String model){
        this.color = color;
        this.doorNum = doorNum;
        this.make = make;
        this.model = model;        
    }

    public Car(Car source){
        this.color = source.color;
        this.doorNum = source.doorNum;
        this.make = source.make;
        this.model = source.model;
    }

    public String getColor() {
        return color;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        // * check if it is null
        if(obj == null) {
            return false;
        }
        // * check if the object is not an instance of a specified type
        if(!(obj instanceof Car)) {
            return false;
        }
        // * type cast it if it is instance of a specified type
        Car car = (Car)obj; 
        // * check all fields to be equals with passed object
        if(!(this.color.equals(car.color) && this.make.equals(car.make) && this.model.equals(car.model) && this.doorNum == car.doorNum)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color, this.model, this.doorNum, this.make);
    }
}