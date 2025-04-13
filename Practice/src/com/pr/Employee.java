package com.pr;

@Table(name = "Employ")
public class Employee {

	 String name;
	 double sal;
	 Integer age;
	 String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAddress() {
		return age;
	}
	public void setAddress(Integer address{
		this.age = age;
	}

	public Employee(String name,Integer age,  double sal) {
		super();
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}
	
	
	
}
