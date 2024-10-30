package constructor;

public class BankOfBaroda {
	String account;
 	String accHolderName;
 	int amount;
	
	public BankOfBaroda(String account,String accHolderName,int amount) {
		this.account=account;
		this.accHolderName=accHolderName;
		this.amount=amount;
	}
    public void accDetails()
    {
      
	  System.out.println("Account "+account);
	  System.out.println("AccountHolderName " +accHolderName);
	  System.out.println("Amount "+amount);
    }
}
