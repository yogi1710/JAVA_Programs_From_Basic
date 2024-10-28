import java.util.*;

class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Question_5 {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    // Method to remove an employee
    public void removeEmployee(int id) {
        employeeMap.remove(id);
    }

    // Method to search for an employee by ID
    public Employee searchEmployee(int id) {
        return employeeMap.get(id);
    }

    public static void main(String args[]) {
        Question_5 employeeManagement = new Question_5();
        employeeManagement.addEmployee(new Employee(1, "Yogi", "Data Science"));
        employeeManagement.addEmployee(new Employee(2, "Hari", "CSE"));
        employeeManagement.addEmployee(new Employee(3, "Manju", "ECE"));

        System.out.println("Searching employee record:");
        System.out.println(employeeManagement.searchEmployee(3));

        System.out.println("Removing the employee record:");
        employeeManagement.removeEmployee(2);
        System.out.println("Employee with ID 2 removed.");

        System.out.println("Searching employee record:");
        System.out.println(employeeManagement.searchEmployee(2));
    }
}