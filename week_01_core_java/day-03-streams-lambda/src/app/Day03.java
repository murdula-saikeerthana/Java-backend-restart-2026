package app;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.EmployeeDetails;

public class Day03 {
    public static void main(String[] args) {
        List<EmployeeDetails> employees = new ArrayList<>();
        EmployeeDetails e1 = new EmployeeDetails(1, "Charlie", 3500000);
        EmployeeDetails e2 = new EmployeeDetails(2, "Richard", 45000);
        EmployeeDetails e3 = new EmployeeDetails(3, "Jackson", 500000);
        EmployeeDetails e4 = new EmployeeDetails(4, "Annie", 349876);
        EmployeeDetails e5 = new EmployeeDetails(5, "Nihan", 23000);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        List<EmployeeDetails> filteredEmployees = employees.stream()
                                                    .filter(emp -> emp.getSalary() > 50000)
                                                    .collect(Collectors.toList());
        System.out.println("Employees salary greater than 50000: "+filteredEmployees);
        
        System.out.println("Employee Names: ");
         employees.stream()
        .map(EmployeeDetails :: getName)
        .forEach(System.out :: println);
       
        List<EmployeeDetails> sortedEmployees = employees.stream()
                          .sorted(Comparator.comparing(EmployeeDetails :: getSalary))
                          .collect(Collectors.toList());
        System.out.println("Sorted employee list: "+sortedEmployees);

        System.out.println("Total employees : " + employees.size());

        Optional<EmployeeDetails> highestSalaryEmployee = employees.stream()
                                                .max(Comparator.comparing(EmployeeDetails:: getSalary));
        
        System.out.println("Employee with Highest Salary: "+ highestSalaryEmployee.orElse(new EmployeeDetails(0, "No Employee", 0)));


    }
}
