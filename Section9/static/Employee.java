public class Employee {
    private String name;
    private String position;
    private static int hiredCount; 

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        hiredCount++;
    }
  
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }

    public static int getHireCount(){
        return hiredCount;
    }
  
    public void greet(String company) {
        if (company.equals("JAVASTARS")) {
            System.out.println("Welcome!");
        }
    }


    public String toString() {

        return "\tName: " + name + "\tPosition: " + this.position + "\tCompany: " + "JAVASTARS" + "\n";
    }
}
