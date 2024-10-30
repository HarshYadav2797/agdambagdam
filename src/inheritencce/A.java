package inheritencce;

public class A {
	int a;
	
	public A(int a)
	{
		super();
	}
	
	static {
    System.out.println("parent is loading");
	}
     void m1()
    {
   
	System.out.println("Parent");
    }
}
