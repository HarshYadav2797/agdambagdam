package encapsulation;

public class RDriver {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(15);
		r.setWidth(3);
		System.out.println(r.getArea()+ "Area of Rectangle");
	}

}
