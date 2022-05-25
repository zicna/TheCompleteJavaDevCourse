package shallow_copy;

public class Main{
    public static void main(String[] args) {

        Company cmp = new Company("Zicna INC", 2015);
        Employee emp = new Employee("Milan", 35, 45000.15, cmp);
        Company cmp1 = new Company("b2", 2017);


        System.out.println("This is employee one: " + emp);
        
        try {
            Employee emp1 = (Employee) emp.clone();
            System.out.println("This is employee two: " + emp1);
            
            // ! by changing name of a company in employee clone we wre changing name of the company in employe original
            // emp1.company.setName("B2");
            emp1.getCompany().setName("B2");
            System.out.println("This is employee two: " + emp1);
            System.out.println("This is employee one: " + emp);
            
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }



        
    }
}