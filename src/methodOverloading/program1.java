package methodOverloading;

public class program1 {
	int roll_no;
	String name;
public String m1(String name)
{
	return name;
}
public int m2(int roll_no)
{
	return roll_no;
}
public String m4(String name,String bff)
{
	String s= name+bff;
	return s;
}
public String m3(String name, int roll_no)
{
	return name;
	
}
}
