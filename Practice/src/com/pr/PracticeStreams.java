package com.pr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeStreams {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Grape", "Apricot");
		words.stream().filter(n -> n.startsWith("A")).peek(n -> System.out.println(n)).collect(Collectors.toList());
		System.out.println();

		List<Integer> numbers = Arrays.asList(10, 25, 37, 89, 12);
		System.out.println("Max Number of" + " " + numbers);
		int max = numbers.stream().max(Integer::compare).get();
		System.out.println(max);
		System.out.println();

		System.out.println("Sum of Odd Numbers");
		int sumOfOdd = numbers.stream().filter(n -> n % 2 == 1).peek(System.out::println).reduce(0, Integer::sum);
		System.out.println("sum" + sumOfOdd);

		System.out.println();
		System.out.println("List Sorting");
		words.stream().sorted().peek(System.out::println);

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", 30, 7000));
		employees.add(new Employee("Bob", 25, 8000));
		employees.add(new Employee("Charlie", 30, 10000));
		employees.add(new Employee("Bgm", 30, 30000));
		employees.add(new Employee("Bgm", 30, 60000));
		employees.add(new Employee("Bgm", 30, 100000));
		employees.add(new Employee("Eve", 28, 150000));

		System.out.println();
		List<String> names = employees.stream().map(emp -> emp.name).collect(Collectors.toList());
		System.out.println(names);

		System.out.println();
		List<Employee> newSal = employees.stream().map(emp -> new Employee(emp.name, emp.age, emp.sal + 10000)).collect(Collectors.toList());
		System.out.println(newSal);
		
		System.out.println();
		Map<String, List<Employee>> grpEmp = employees.stream().collect(Collectors.groupingBy(emp -> {
			if (emp.sal <= 7000) return "Low Salary";
			else if (emp.sal <= 12000) return "Medium Salary";
			else return "High Salary";
		}));
		grpEmp.forEach((cat,Emp)->{
			System.out.println("Cat "+cat +" Emp " + Emp);
		});
		System.out.println();

	}
}
