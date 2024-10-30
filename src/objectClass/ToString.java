package objectClass;

public class ToString {
	String compname;
	String empname;
	int sal;
	
	
	ToString(String compname,String empname,int sal )
	{
		this.compname=compname;
		this.empname=empname;
		this.sal=sal;
	}
	
	/**
	 * This method is overridden method as object class(parent) class have same method as this class
	 */
	
	@Override
	public String toString()
	{
		return "compname " + compname+" empname " + empname+
				" sal " + sal ;
    }
	
	public void empDetails()
	
	{	 
		System.out.println(compname);
		System.out.println(empname);
		System.out.println(sal);
	}
	

}
