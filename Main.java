package week8;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Create some employees
        Employee emp1 = new Employee(1, "Alice", "HR", 50000);
        Employee emp2 = new Employee(2, "Bob", "Engineering", 70000);

        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        // Display employees
        System.out.println("Employee List:");
        manager.listEmployees();
    }
}
