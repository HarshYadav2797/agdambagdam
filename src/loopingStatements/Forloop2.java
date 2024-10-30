package loopingStatements;

public class Forloop2 {
public static void main(String[] args) {
	/**
	 * divisible by 3 from 100 to 1
	 */
	System.out.println("main starts");
	for(int i=100; i>=1; i--)
	{
		if (i%3==0) {
			
			System.out.println(i);
		}
	}
	 System.out.println("main ends");
}
}