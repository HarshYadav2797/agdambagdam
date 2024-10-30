package staticMethods;

public class StaticMethod {
	/**
	to use static method of the class inside another class we will use classname as reference*/
public static void m1()
{
	System.out.println("yo");
}

public static void main(String[] args) {
	StaticMethod.m1();
}
}
