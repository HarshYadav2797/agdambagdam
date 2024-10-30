package operator;

public class RelationalOperators {

	int a =20;
	int b =30;
	
	public void stu1()
	{
		if (a>b) {
			System.out.println("a is greater " + a);
			
		}
		else {
			System.out.println("b is greater " + b);
		}
	}
	
	public static void main(String[] args) {
		RelationalOperators n = new RelationalOperators();
		n.stu1();
		
	}
	
	
}
