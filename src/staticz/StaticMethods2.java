package staticz;

public class StaticMethods2 {
static int	M=StaticMethods.v; //used static method of another class inside this
  
  public static void main(String[] args) {
	
	  System.out.println(M);
	  System.out.println(StaticMethods.b);
	  
  }
}
