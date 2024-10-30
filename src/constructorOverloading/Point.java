package constructorOverloading;

public class Point {
	/**
	 * Create a class Point with fields x and y. 
	 * Write a copy constructor that initializes a new Point object using an existing Point object. 
	 * Also, provide constructors to initialize x and y with integer and double values.
	 */
	int x;
	int y;
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
  double a=(double)x;
  double b=(double)y;
  public Point(double a, double b)
  {
	  this.a=x;
	  this.b=y;
  }
  public void m1()
  {
	  System.out.println(x);
	  System.out.println(y);
	  System.out.println(a);
	  System.out.println(b);
  }
}
