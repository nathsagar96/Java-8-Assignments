package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create a new arraylist
        List<Employee> employeeList = new ArrayList<Employee>();

        //Add data to the arraylist
        employeeList.add(new Employee(111, "Jiya Brein", "Mumbai", 25000));
        employeeList.add(new Employee(122, "Paul Niksui", "Tokyo", 13500));
        employeeList.add(new Employee(133, "Martin Theron", "Mumbai", 18000));
        employeeList.add(new Employee(144, "Murali Gowda", "Chennai", 32500));
        employeeList.add(new Employee(155, "Nima Roy", "Kolkata", 22700));

        //sort arraylist
        Collections.sort(employeeList, Employee::compareBySal);

        //display arraylist
        employeeList.forEach(System.out::println);
    }
}
