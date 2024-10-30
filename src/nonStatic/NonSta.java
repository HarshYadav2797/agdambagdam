package nonStatic;

public class NonSta {
	int b=6;
	static int n=9;
	
	public static void m2()
	{
		System.out.println("yo");
	}
public void m1()
{
	System.out.println(n);
	m2();
}
}
