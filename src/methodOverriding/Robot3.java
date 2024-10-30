package methodOverriding;

abstract public class Robot3 extends Robot2{
	abstract public void m1();
	@Override
	public void m2()
	{
		System.out.println("robo2");
	}

}
