package constructorOverloading;

public class BookInfo {
	public static void main(String[] args) {
		
	
	System.out.println("First Constructor Method");
	
	Book b= new Book("JUNGLE BOOK", "CHARLES DICLENS", 24);
	b.m1();
	
	System.out.println("Second Constructor Method");
	
	Book b1= new Book("harry potter", "unknown");
	b1.m1();
	
	System.out.println("Third Constructor Method");
	
	Book b2= new Book("chor");
	b2.m1();

}
}