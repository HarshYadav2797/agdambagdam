package preprogramming;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pin");
		int pin = sc.nextInt();
		System.out.println("Welcome Harsh");
		System.out.println("1) check balance" + "\n2) Money Withdrawl");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: {
			int amount = sc.nextInt();
			System.out.println("ENTER THE AMOUNT" + amount);
			break;
		}
		
		}
		
	}

}
