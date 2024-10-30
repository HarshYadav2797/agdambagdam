 package operator;

    public class ConditionalOperators5 {
	 /**
	  * Write a Java program to check if a given year is a leap year using conditional operators. 
	  * Use the following year:
	  * int year = 2024
	  */
	 public static void main(String[] args) {
		 int year=2024;
		 
	 String ref=(year%4==0 ||(year%100==0 && year % 400==0))? " leap" : " not a leap year";
	 System.out.println(ref);
		
		
	}
}
