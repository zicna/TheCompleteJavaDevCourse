public class AreaCalculator{
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 – Square\n2 – Rectangle\n3 – Triangle\n4 – Circle\n");

        double square = areaSquare(2); 
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2); 
        double circle = areaCircle(2); 

        printAreas(square, rectangle, triangle, circle);
    }

    public static double areaSquare(double side){
        if(side < 0){
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return length * width;
    }

    public static double areaTriangle(double base, double height){
        if(base < 0 || height < 0){
            System.out.println("Error: impossible");
            System.exit(0);
        }
        return base * height / 2;
    }

    public static double areaCircle(double radius){
        if(radius < 0){
            System.out.println("Error impossible");
            System.exit(0);
        }
        return Math.PI * radius * radius;
    }

    public static void printAreas(double squareArea, double rectangleArea, double triangleArea, double circleArea){
        System.out.println("Square area: " + squareArea);
        System.out.println("Square area: " + rectangleArea);
        System.out.println("Square area: " + triangleArea);
        System.out.println("Square area: " + circleArea);
    }
}