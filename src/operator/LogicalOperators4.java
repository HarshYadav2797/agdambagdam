package operator;

public class LogicalOperators4 {
	/**
	 * Write a Java program to check if a given number is greater than 100 or less than 50, and is not equal to 75.
	 * Use the following number: 120
	*/
	public static void main(String[] args) {
		int num =120;
		if ((num>100 || num<50) && num!=75) {
			System.out.println("number is greater than 100 or less than 50 and is not equal to 75");
		}
		else {
			System.out.println("nope");
		}
	}
	
}
