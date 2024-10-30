package encapsulation;

public class Mdriver {
	public static void main(String[] args) {
		Manager m= new Manager();
		m.setDepartment("yo");
		m.setName("harsh");
		m.setSalary(10000);
		System.out.println(m.getDepartment());
	}

}
