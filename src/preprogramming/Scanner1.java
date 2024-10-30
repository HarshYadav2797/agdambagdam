package preprogramming;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
			
		
		System.out.println("Simple Calculation");
		System.out.println("1) Addition" + "\n2) Substraction");
		System.out.println("3) Multiplication " + "\n4) Division");
		System.out.println("5) Exit");
		System.out.println("--------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		int a;
		int b;
		
		

		switch(choice) {
		case 1 : {
			
			System.out.println("Enter 2 values");
			a = sc.nextInt();
			b=sc.nextInt();
			System.out.println(" Addition : " + (a+b));
			break;
		}
		
		case 2:
		{
			
			System.out.println("Enter 2 values");
			a = sc.nextInt();
			b=sc.nextInt();
			System.out.println(" Substraction : " + (a-b));
			break;
		}
		case 3:
		{
			
			System.out.println("Enter 2 values");
			a = sc.nextInt();
			b=sc.nextInt();
			System.out.println(" Multiplication : " + (a*b));
			break;
		}
		case 4:
		{
			
			System.out.println("Enter 2 values");
			a = sc.nextInt();
			b=sc.nextInt();
			System.out.println(" Division : " + (a/b));
			break;
		}
		case 5:
		{
			System.out.println("Thankyou");
			System.exit(0);
			break;
		}
		default : System.out.println("invalid choice");
			
		
	}

}
}