package shadowing;

public class Child extends Parent {
	@Override
	public void display()
	{
		
		System.out.println("child class method");
	}
	
public static void main(String[] args) {
	Parent  parent = new Child();
	
	parent.display();
}
}
