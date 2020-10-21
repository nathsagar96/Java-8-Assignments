package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    String address;
    double salary;

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        //Create a new arraylist
        List<Employee> employeeList = new ArrayList<Employee>();

        //Add data to the arraylist
        employeeList.add(new Employee(111, "Jiya Brein", "Mumbai", 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", "Tokyo", 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", "Mumbai", 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", "Chennai", 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", "Kolkata", 22700.0));

        //Display arraylist
        employeeList.forEach(System.out::println);
    }
}
