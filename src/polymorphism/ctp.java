package polymorphism;

public class ctp {
          
	
	
	public void m1(String b)
	{
		System.out.println(b);
	}
	
	public void m1(int a)
	{
		System.out.println(a);;
	}
	 public static void main(String[] args) {
		ctp c = new ctp();
		c.m1(2);
	}

}
