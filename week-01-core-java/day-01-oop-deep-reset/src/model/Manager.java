package model;

import policy.BonusPolicy;

public class Manager extends Employee implements BonusPolicy {
    private String department;
    private int teamSize;

   public Manager(String name, int age, int employeeId, int salary, String department, int teamSize) {
        super(name, age, employeeId, salary); // Call to Employee constructor
        this.department = department;
        this.teamSize = teamSize;
    }   
    @Override
    public double calculateBonus(int salary) {
        // Implementation for calculating manager bonus
        return salary * 0.2; // Example: 20% of salary as bonus
    }
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", department='" + department + "', teamSize=" + teamSize + "}";
    }
}
