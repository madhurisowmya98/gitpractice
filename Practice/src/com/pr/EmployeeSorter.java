package com.pr;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30,  70000));
        employees.add(new Employee("Bob", 25,  85000));
        employees.add(new Employee("Charlie", 30, 70000));
        employees.add(new Employee("Bgm", 30,  90000));
        employees.add(new Employee("Eve", 28, 85000));

        // Sorting using Lambda Expressions
        employees.sort((e1, e2) -> {
            if (Double.compare(e2.getSal(), e1.getSal()) != 0) {
                return Double.compare(e2.getSal(), e1.getSal()); // Descending Salary
            } else if (Integer.compare(e1.getAge(), e2.getAge()) != 0) {
                return Integer.compare(e1.getAge(), e2.getAge()); // Ascending Age
            } else {
                return e1.getName().compareTo(e2.getName()); // Alphabetical Name
            }
        });

        // Print sorted employees
        employees.forEach(System.out::println);
    }
}
