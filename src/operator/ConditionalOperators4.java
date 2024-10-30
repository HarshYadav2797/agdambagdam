 package operator;

 public class ConditionalOperators4 {
	 
	  /**
	  * Write a Java program to assign a grade based on the marks obtained. Use the following marks: 85
	  */
	 public static void main(String[] args) {
		int num=85;
		String ref = (num>=90)? "A":(num>=80)? "B" :(num>=70)? "C":"D";
		System.out.println(ref);
		
		
	}
}
