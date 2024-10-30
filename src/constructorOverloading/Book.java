package constructorOverloading;

public class Book {
	/**
	 * Create a class Book with fields title, author, and price. 
	 * Write three constructors: one that initializes all fields, 
	 * one that initializes title and author, and one that initializes only title.
	 */
String title;
String author;
int price;


public Book(String title ,String author,int price)		
{
	this.title=title;
	this.author=author;
	this.price=price;
}
public Book(String title ,String author)
{
	this.title=title;
	this.author=author;
}
public Book(String title)
{
	this.title=title;
}
public void m1()
{
	System.out.println(title);
	System.out.println(author);
	System.out.println(price);
}

}
