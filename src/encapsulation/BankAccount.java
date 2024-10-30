package encapsulation;

public class BankAccount {
/**
 * Create a BankAccount class with private fields for  balance
 * Provide getters and setters for these fields. 
 * Ensure that the balance can only be set if it is non-negative.
 */
	
	   private double price=1000;
	   
	   //Getters
	   public double getPrice()
	   {
		   return price;
	   }
	   
	   //Setters
	   public void setPrice(double a)
	   {
	   if (a>=0) {
	
	   this.price=a;
	   }
	   else {
	   System.out.println("Balance not updated");
		}
	}
	
}





		
	

