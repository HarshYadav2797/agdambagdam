package operator;

public class LogicalOperators2 {
/**
 * Write a Java program to check if a given number is either negative or divisible by 3. Use the following number:
 * number=-9;
 */
	
	public static void main(String[] args) {
		int num=-9;
		if (num<0 || num%3==0) {
			System.out.println("number is negative or divisible by 3");
			
		}
		else {
			System.out.println("do whatever you supposed to do!");
		}
	}
	
}
