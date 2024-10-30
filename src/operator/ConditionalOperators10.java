 package operator;

    public class ConditionalOperators10 {
	/**
	 * odd or even
	 */
    	public static void main(String[] args) {
			int number=30;
			String ref = (number%2==0)? "Even": "Odd";
			System.out.println(ref);
		}
}