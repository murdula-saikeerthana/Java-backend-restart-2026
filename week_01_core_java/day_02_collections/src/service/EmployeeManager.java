package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Employee;

public class EmployeeManager {
    private List<Employee> employeeList = new ArrayList<>();
    private  Map<Integer, Employee> employeeMap = new HashMap<>();
    
    public void addEmployee(Employee e){
        if(!employeeMap.containsKey(e.getId()))
        {
            employeeMap.put(e.getId(),e);
            employeeList.add(e);
        } 
        else
            System.out.println("It is a duplicate cannot be added to List/Map. ");                 
    }

     public Employee getEmployeeById(int id){
       if(! employeeMap.containsKey(id))
            {
                return null;
            }
            return employeeMap.get(id);
        }

    public void printEmployees(){
        if(employeeList.isEmpty())
            System.out.println("List is empty");
        else{
            System.out.println("Employee Details: ");
            for(Employee employeeDetail: employeeList )
            {
            System.out.println(employeeDetail);
                                
            }
        }
        
    }
   }
