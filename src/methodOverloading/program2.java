package methodOverloading;

public class program2 {
	int roll_no;
	String name;
public static void main(String[]args)
{
	program1 n = new program1();
	System.out.println(n.m1("yes"));
	System.out.println(n.m2(23));
	System.out.println(n.m3("u", 6));
	System.out.println(n.m4("h", "ssss"));
}
}