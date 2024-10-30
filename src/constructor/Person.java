package constructor;

public class Person {
	/**
	 * Create a Person class with fields firstName, lastName, age, and address.
	 * Write constructors to initialize these fields and provide getters and setters. 
	 * Also, ensure age cannot be negative.
	 */
 private String firstName;
 private String lastName;
 private int age;
 private String address;
 
 
 public Person(String firstName,String lastName,int age, String address)
 {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.age=age;
	 this.address=address;
	 
 }
 public String getLastName()
 {
	 return lastName;
 }
 public String getFirstName()
 {
	 return firstName;
 }
 public int getAge()
 {
	 return age;
 }
 public String address()
 {
	 return address;
 }
 
public void m1()
{
	if (age>0) {
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(age);
		
	}
	else {
		System.out.println("age can't be negative");
	}
	
}
 
 
}
