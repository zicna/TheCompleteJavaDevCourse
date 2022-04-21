package GenericMetthods;
public class GenericMethods{

    public static void printName(String name){
        System.out.println("Name: " + name);
    }

    public static <T> void printWhatEver(T obj){
        if(obj instanceof Integer){
            System.out.println("You passed Integer: " + obj);
        }else if(obj instanceof String){
            System.out.println("You passed String: " + obj);
        }else if(obj instanceof Double){
            System.out.println("You passed Double: " + obj);
        }
    }
}