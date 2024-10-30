package interface1;

public class Animal3 implements Animal, Animal2{
	@Override
	public void eat()
	{
		System.out.println("animal e");
	}
	@Override
	public void travel()
	{
		System.out.println("animal t");
	}

}
