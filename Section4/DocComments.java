public class DocComments{
    public static void main(String[] args) {
        
    }
/**
 * Function name greet
 * 
 * Inside the function:
 * 1. prints 'Hi'
 * 
 */
    public static void greet(){
        System.out.println("Hi");
    }
/**
 * Function name: printText
 * @param name(String)
 * @param age(String)
 * 
 * Inside the function:
 * 1. prints the name and age as part of a text
 */
    public static void printText(String name, String age){
        System.out.println("Hi I am " + name+ " and I'm " + age + " years old.");
    }
/**
 * Function name: calculateArea
 * 
 * @param length (double)
 * @param width (double)
 * @return (double)
 * 
 * Inside a function: 
 * 1. calculate the area and returns it
 */
    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
}
