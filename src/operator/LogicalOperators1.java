 package operator;

 public class LogicalOperators1 {
	
	/**
	 * Question : Write a Java Program to Check if the given number is positive and divisible by 5.
	 * int num=25;
	 * 
	 */
    public static void main(String[] args) {
	int num=26;
	if(num>0 && num%5==0) {
		System.out.println("Number is positive and is Divisibel by 5");
	}
	else if (num<0 && num%5==0) 
		
	{
		System.out.println("number is negative and is divisible by 5");
		
	}
	else if (num>0 && num%5!=0) {
		System.out.println("number is positive but not divisible by 5");
		
	}
	else {
		System.out.println("Do whatever you supposed to do!");
	}
}
	
	
	
}
