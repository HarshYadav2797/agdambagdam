package encapsulation;

/**
 * Create a Rectangle class with private fields for length and width. 
 * Provide public getters and setters for these fields. 
 * Also, provide a method getArea() that calculates and returns the area of the rectangle.
 * Write a program to demonstrate setting the length and width and getting the area.

java

 * @author HP
 *
 */
public class Rectangle {
	
    private	int length;
	private int width;

	//Getters
	public int getLength()
	{
		return length;
	}
	
	//Setters
	
	public void setLength(int length)
	{
		if (length>=0) {
		
		this.length=length;
	}
		else {
			System.out.println("length cannot be negative");
		}
	}
	
	//Getters
	public int getWidth()
	{
		return width;
	}
	//setters
	public void setWidth(int width)
	{
		if (width>=0) {
		this.width=width;	
		}
		else {
			System.out.println("width cant be negative");
		}
	}
	
	public int getArea()
	{
		return length*width;
	}
}
