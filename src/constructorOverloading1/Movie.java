package constructorOverloading1;

public class Movie {
String mname;
String hname;
int price;
String hall;

Movie(String mname){
	this.mname=mname;

}
Movie(String mname, String hname){
	this.mname=mname;
	this.hname=hname;
	
}
Movie(String mname, String hname, int price){
	this.mname=mname;
	this.hname=hname;
	this.price=price;
	
	
}
Movie(String mname, String hname, int price, String hall){
	this.mname=mname;
	this.hname=hname;
	this.price=price;
	this.hall=hall;
}
public void m1()
{
	System.out.println(mname);
	System.out.println(hname);
	System.out.println(price);
	System.out.println(hall);
}
}
