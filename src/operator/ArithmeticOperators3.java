package operator;

 public class ArithmeticOperators3 {
	 
 //Using Modulus
 /*public static void main(String[] args) {
		
	
   int a= 15;
   int b= 10;
   int c= a%b;
   System.out.println(c);
 
 }*/
 
 //OR
	 
   /*static   int a= 15;
	static   int b= 10;
	static   int c= a%b; 
 
    public static void main(String[] args) {
	System.out.println(c);
	
  }*/
 
    //Or
	/*USING RETURN TYPE AND STATIC METHODS*/
	 
    /*static 	  int a= 15;
    static	  int b= 10;
    static	  int c= a%b; 
    public static int m1(int c)
	{
		 return c;
	}
	public static void main(String[] args) {
    System.out.println(m1(c));
		
 
}	*/
	//Or
	/*USING RETURN TYPE AND STATIC METHODS*/
	 
	 
	int a= 15;
	int b= 10;
	int c= a%b; 
	public  int m1()
	{
	return c;
    }
	public static void main(String[] args) {
	ArithmeticOperators3 n = new ArithmeticOperators3();
	 		 
	System.out.println(n.m1());
	 		
	 }	 

 }