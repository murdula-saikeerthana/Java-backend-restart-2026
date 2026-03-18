package model;

public class EmployeeDetails {

    private int id;
    private String name;
    private int salary;
    
    public EmployeeDetails(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
    
}
