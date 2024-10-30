package constructor;

public class BankAccount {
	/**
	 * Bank Account Class
Create a BankAccount class with fields accountNumber, accountHolderName, and balance. Write constructors to:
Initialize all fields.
Initialize accountNumber and accountHolderName with a default balance of 0.0.
Ensure that the balance cannot be negative in any constructor.
	 */
	int accountNumber;
	String accountHolderName;
    double balance;
    
    
   public BankAccount(int accountNumber,String accountHolderName,double balance)
   {
	   this.accountHolderName=accountHolderName;
	   this.accountNumber=accountNumber;
	   this.balance=balance;
   }
   
   public BankAccount(String accountHolderName, int accountNumber)
   {
	   this.accountHolderName=accountHolderName;
	   this.accountNumber=accountNumber;
	   this.balance=2.0; //default balance
   }
   
   
   public void m1() {
	 
	 if (balance>=0) {
		 System.out.println(accountHolderName);
	
		 System.out.println(accountNumber);
		 System.out.println(balance);
	}
	 else {
		 System.out.println(accountHolderName);
		 System.out.println(accountNumber);
		 System.out.println("minus me hai balance");
		
		
	 }
  }
   public void m2()
   {
	   System.out.println(accountHolderName);
	   System.out.println(accountNumber);
	   System.out.println(balance);
   }

}
