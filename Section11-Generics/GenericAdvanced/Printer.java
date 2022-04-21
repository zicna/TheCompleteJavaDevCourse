import java.util.ArrayList;

public class Printer<T extends Animal>{

    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
    

    
    

}