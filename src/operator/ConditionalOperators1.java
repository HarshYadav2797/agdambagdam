 package operator;

 public class ConditionalOperators1 {
	 /**
	  * Write a Java program to check if a person is eligible to vote. A person is eligible to vote if their age is 18 or older. 
	  * Use the following age:20
	  */
	public static void main(String[] args) {
		int age=20;
		Object res = (age>=18)? "eligible":"not"; 
		System.out.println(res);
	
	}
	
}
