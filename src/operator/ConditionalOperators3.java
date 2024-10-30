 package operator;

 public class ConditionalOperators3 {
	 /*Write a Java program to check if a given number is within the range of 10 to 50 (inclusive) using conditional operators.
	  *Use the following number: int number = 35
      */
	 
	  public static void main(String[] args) {
	   int number=35;
	   String ref = (number>=10 && number<=50)? "within range" : "outside range";
	   System.out.println(ref);
      }
}
