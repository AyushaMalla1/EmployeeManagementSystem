package week8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}