package inheritencce;

public class Child extends Parent{
	static 
	{
		System.out.println("Child is loading");
	}
    static void m2()
    {
    	System.out.println("respect");
    }
}
