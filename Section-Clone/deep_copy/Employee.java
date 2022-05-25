package deep_copy;

public class Employee{
    private String name;
    private int age;
    private double salary;
    private Company company;

    public Employee(String name, int age, double salary, Company company){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }

    public Employee(Employee source){
        this.name = source.name;
        this.age = source.age;
        this.salary = source.salary;
        this.company = source.company;
    }

    public int getAge() {
        return age;
    }

    public Company getCompany() {
        return company;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "This is our employee \n" + "Employee name is: " + this.name + "\nEmployee age is: " + this.age + "\nEmployee salary is: " + this.salary + "\nhe works in: " + this.company.getName() + "\n";
    }

    

    

    
}