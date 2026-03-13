package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Employee;
import service.EmployeeManager;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
    Employee e1 = new Employee(101, "Charlie", "Sales");
    Employee e2 = new Employee(102, "Richard", "Finances");
    Employee e3 = new Employee(101, "John", "Sales");
        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);
        if (manager.getEmployeeById(999)==null)
            System.out.println("There is no match found.");
        else
            System.out.println("I found the match "+ manager.getEmployeeById(e1.getId()));

       manager.printEmployees();
                   
    }
}
