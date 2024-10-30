package objectClass;

public class ToStringnew {
	
	int a;
	int sal;
	public void m1()
	{
		System.out.println(a);
		System.out.println(sal);
	
	}
	
	public ToStringnew(int a, int sal) {
		this.a=a;
		this.sal=sal;
	}

	@Override // its a overridden method as demo class is inheriting object class and object class also has toString() inside it
	public String toString()
	{
		return "sal "+ sal+" a "+a;
		
	}
	//there csn only be one toString method
	
	
	}
	

