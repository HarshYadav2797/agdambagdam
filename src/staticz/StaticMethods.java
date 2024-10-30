package staticz;

public class StaticMethods {
	static
	{
		System.out.println("yabadabadoooo");
	}
  static int v=5;
  static int b=5;
  int c=6;
  
  public static void main(String[] args) {
	System.out.println(v*b);
	StaticMethods v1 = new StaticMethods();
	System.out.println(v1.c*v);
 	System.out.println(b);
}
}
