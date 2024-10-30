package methodOverloading;

public class Rectangle {
	
	private int breadth;
	private int length;
	

   //Constructor creation
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	 
	//Default Constructor
	
	public Rectangle()
	{
		this.length=1;
		this.breadth=1;
	}
	
	//Getters
	public int getLength()
	{
		return length;
	}
	public int getBreadth()
	{
		return breadth;
	}
	
	//setters
	public void setLength()
	{
		 length=3;
		 
	}
	public void setBreadth()
	{
		breadth=4;
	}
	
	public void ar()
	{
		System.out.println(length*breadth);
	}
	
	//Method overloading
	public int area(int a, int b, int c)
	{
		return a*b*c;
	}
    public void area(int a, int b)
    {
    	System.out.println( a*b);
    }
    
    
    public static void main(String[] args) {
	Rectangle r = new Rectangle();
	r.area(2, 50);
	System.out.println(r.area(45, 89, 89));
	r.ar();
	
	Rectangle rr = new Rectangle(7, 80);
	rr.ar();
	}
}
