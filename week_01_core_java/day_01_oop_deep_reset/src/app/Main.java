package app;

import model.Employee;
import model.Manager;


public class Main {
    public static void main(String[] args) {
      
        Employee emp = new Employee("Bob", 30, 101, 50000);
        Manager mgr = new Manager("Charlie", 40, 102, 70000, "Sales", 15);

        System.out.println(emp.getName() + " Bonus: " + emp.calculateBonus(emp.getSalary()));
        System.out.println(mgr.getName() + " Bonus: " + mgr.calculateBonus(mgr.getSalary()));
    }
    
}
