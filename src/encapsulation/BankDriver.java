package encapsulation;

public class BankDriver {
	public static void main(String[] args) {
		 
		       BankAccount bk = new BankAccount();
		      
		       bk.setPrice(-6000);
		       System.out.println(bk.getPrice());
}
}