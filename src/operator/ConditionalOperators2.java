 package operator;

 public class ConditionalOperators2 {
	 /**
	  * Write a Java program to find the greatest of three given numbers using conditional operators. 
	  * Use the following numbers:
	  * int num1 = 45;
	  * int num2 = 25;
      * int num3 = 65;
	  */
	public static void main(String[] args) {
		int num1=45;
		int num2=25;
		int num3=65;
		int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The greatest number is " + greatest);
	}
}
