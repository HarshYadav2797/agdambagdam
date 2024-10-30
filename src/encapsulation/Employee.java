package encapsulation;

public class Employee {
	/**
	 * Create a base class Employee with private fields for name and salary. 
	 * Provide public getters and setters for these fields. 
	 * Then, create a subclass Manager that adds a private field for department with appropriate getters and setters.
	 * Write a program to demonstrate setting and getting these properties.
	 */
 private String name;
 private double salary;
 
 //Getters
 public String getName()
 {
	 return name;
 }
 
 //Setters
 public void setName(String name)
 {
	 this.name=name;
 }
 
 //Getters
 public double getSalary()
 {
	 return salary;
 }
 
 //Setters
 public void setSalary(double salary)
 {
	 this.salary=salary;
 }
}
