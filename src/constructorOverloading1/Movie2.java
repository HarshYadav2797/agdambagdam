package constructorOverloading1;

public class Movie2 {

public static void main(String[] args) {
Movie n = new Movie("bloody daddy");
Movie n1= new Movie("leo", "salman khan");
Movie n2= new Movie("leo", "salman khan", 0);
Movie n3= new Movie("leo", "salman khan", 200, "galaxy");


n.m1();
n1.m1();
n2.m1();
n3.m1();




	
}
}
