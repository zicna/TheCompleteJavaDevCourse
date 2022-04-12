import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Paul", "Stoker");
        Employee assisManager = new Employee("Nicholas", "Assistant Manager");
        Employee manager = new Employee("Demian", "Manager");

        Store store = new Store();
        store.setEmployees(0, stocker);
        store.setEmployees(1, assisManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
        
    }
}