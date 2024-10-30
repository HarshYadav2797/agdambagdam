 package operator;

    public class ConditionalOperators7 {
	 /**
	  * Write a Java program to determine if a student has passed or failed based on their score.
	  * A student passes if their score is 50 or above. Use the following score:
	  * int score = 45;
	  */
    	
    public static void main(String[] args) {
    	int score=45;
    	String ref = (score>=50)? "pass" : "fail";
		System.out.println(ref);
		}
}
