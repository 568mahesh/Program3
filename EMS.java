package Program3;
import java.util.ArrayList;
import java.util.List;


class Employee {
   
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

 
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-----------------------------------");
    }
}

public class EMS {

    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(1, "John Doe", 50000.00);
        Employee emp2 = new Employee(2, "Jane Smith", 60000.00);
        Employee emp3 = new Employee(3, "Mike Johnson", 55000.00);

        // Storing employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Displaying details of all employees
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
