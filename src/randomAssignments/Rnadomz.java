package randomAssignments;

public class Rnadomz {
	
	public static void add(int a, int b)//this is method called and the arguments inside it are formal arguments
	{
		
		System.out.println("the value is "+ (a+b));
	}
	public static void sub(int a, int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	public static void multiply(int a, int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	public static void div(int a, int b)
	{
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		add(10,20); //method call statement //the arguments inside method call statement is actual arguments
		sub(10,20);//method call statement
		multiply(10,20);//method call statement
		div(10,20);//method call statement
	}
}
