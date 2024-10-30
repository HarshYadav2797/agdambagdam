package constructor;

public class Re3ctangle {
	double length;
	double fields;
	//double area=length*fields;
	
	public Re3ctangle(double length, double fields)
	{
		this.length=length;
		this.fields=fields;
	}
	
 public Re3ctangle()
 {
	 this.fields=1.0;
	 this.length=1.0;
 }
    
    public double ru()
    {
    	return length*fields;
    }
    
    public void p()
    {
    	System.out.println(length*fields);
    }
  }
