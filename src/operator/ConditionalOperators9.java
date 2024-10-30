 package operator;

    public class ConditionalOperators9 {
	/**
	 * Write a Java program to check if a given number is even or odd using conditional operators. 
	 * Use the following number:
	 * int number = 28;
	 */
    	public static void main(String[] args) {
			int number=28;
			String ref = (number%2==0)? "Even": "Odd";
			System.out.println(ref);
		}
}