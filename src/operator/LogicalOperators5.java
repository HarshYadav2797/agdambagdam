package operator;

public class LogicalOperators5 {

	/**
	 * Write a Java program to check if exactly one of the two conditions is true: the number is greater than 20 or the number is even. 
	 * Use the following number: 22
	 */
	public static void main(String[] args) {
		int num=22;
		if (num>20 || num%2==0) {
			System.out.println("Number is either greater or number is even");
			
		}
		else {
			System.out.println("do whatevr you supposed to do!");
		}
	}
	
}
