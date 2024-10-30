package encapsulation;

public class CDriver {
	
	
public static void main(String[] args) {
	
Chocolate c1= new Chocolate();

/*System.out.println(c1.price);
System.out.println(c1.brand);*/
/**
 * It will throw error as data we are trying to access is private
 * so we have to go with getters
 */
System.out.println(c1.getPrice());
System.out.println(c1.getBrand());
c1.setPrice(38);
System.out.println(c1.getPrice());
c1.setBrand("kitkat");
System.out.println(c1.getBrand());
}

/**
 * now we want to modify the data
 */

}
