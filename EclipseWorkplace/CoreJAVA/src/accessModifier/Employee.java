package accessModifier;

//static variables common property
public class Employee {
	int id;
	String name;
	static String companyName = "spark";
	
//	static block
//	{
//		String companyName = "spark";
//	}

	public void show() {
		System.out.println("eid=" + id + " ename= " + name + " company name= " + companyName);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "omkar";
		e1.show();
		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "guru";
		e2.show();
	}
}
