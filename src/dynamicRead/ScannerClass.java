package dynamicRead;

import java.util.Scanner;

public class ScannerClass {
   
   public static void main(String[] args) {
	System.out.println("Enter your mobile number");
	Scanner  sc  =  new Scanner(System.in);
	double Number = sc.nextDouble();
	if (Number>8) {
		System.out.println("Login failed");
		
	}
	else {
		System.out.println("failed");
	}
	System.out.println("enter your name");
	String Name = sc.next();
	System.out.println("Enter your Email");
	String Email = sc.next();
	System.out.println("Enter the password");
	String Password = sc.next();
	System.out.println("you are successfully login");
	
	
	System.out.println("Your Name : "+ Name);
	System.out.println("NUMBER = " + Number);
	System.out.println("EMAIL = " + Email);
	System.out.println("Pass = " + Password);
}
}
