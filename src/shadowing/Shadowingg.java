package shadowing;

public class Shadowingg {
	/**
	 * Create a class with an instance variable x and a method that defines a local variable x with the same name
       Inside the method, print both the local x and the instance x. 
	 * Create an object of the class and call the method.
	 * What output do you expect? Does the local x shadow the instance x?
	 */
String x="12";

public void variable()
{
	int x=10;
	
	System.out.println(this.x);
	System.out.println(x);
}
public static void main(String[] args) {
	Shadowingg sh = new Shadowingg();
	sh.variable();
}
}
