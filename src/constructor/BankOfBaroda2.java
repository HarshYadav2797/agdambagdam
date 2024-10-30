package constructor;

public class BankOfBaroda2 {
	public static void main(String[] args) {
		BankOfBaroda k = new BankOfBaroda("o", "h", 0);
		System.out.println(k.accHolderName);
		System.out.println(k.account);
		System.out.println(k.amount);
		k.accDetails();
		
	}
}
