public class Main{
    public static void main(String[] args){
        Employee employeeOne = new Employee("Milan", "programmer");
        Employee employeeTwo = new Employee("Zicko", "software engineer");
        Employee employeeThree = new Employee("Zile", "software developer");

        System.out.println(Employee.getHireCount());
    }
} 