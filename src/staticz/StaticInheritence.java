package staticz;

public class StaticInheritence {
	int a=90;
	
	public static void m1()
	{
		System.out.println("main");
		StaticInheritence n = new StaticInheritence();
		System.out.println(n.a);
	}

}
