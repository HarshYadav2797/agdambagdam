package inheritencce;

public class Sonata extends Watch{
	
	String type;
	String color;
	
	
	public Sonata(String brand, int price,String color,String type)
	{
		super(brand, price);
		this.color=color;
		this.type=type;
	}
	public String toString()
	{
		return  "color : " + color  + "titan : "
				+  brand  +  "analog : " + type + "analog : " + price+ " : price  ";
		
	}
	

}
