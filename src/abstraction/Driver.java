package abstraction;

public class Driver {
	public static void main(String[] args) {
    /*Demo d = new Demo();  //Cannot create an object of parent class
    now we go for  up casting*/
       Demo d=new User(); //Up Casting
       d.m1();
       d.m2();
       d.m3();
       Demo.m4();
	}
	 /**
	 * this whole process is called as run time Polymorphism of method over riding
	 */
/**
 * Binding will be happening in parent class i.e Demo class and not the User class but different output is there 
 * 
 * 
 * Note: we cannot create object of abstract class
 */
}
