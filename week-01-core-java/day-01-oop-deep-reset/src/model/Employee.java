package model;

import policy.BonusPolicy;

public class Employee extends Person implements BonusPolicy {

    private int employeeId;
    private int salary;
public Employee(String name, int age, int employeeId, int salary) {
        super(name,age); // Call to Person constructor
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public double calculateBonus(int salary) {
        // Implementation for calculating employee bonus
        return salary * 0.1; // Example: 10% of salary as bonus
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" + super.toString() + ", employeeId=" + employeeId + ", salary=" + salary + "}";
    }
    
}
