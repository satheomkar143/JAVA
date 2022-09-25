class Cricketer {
	String name;
	String team;
	int age;

	public
//	default constructor
	Cricketer() {
		name = "";
		team = "";
		age = 0;
	}

//	parameterized constructor
	Cricketer(String n, String t, int a) {
		name = n;
		team = t;
		age = a;
	}

//	copy constructor
	Cricketer(Cricketer ckt) {
		name = ckt.name;
		team = ckt.team;
		age = ckt.age;
	}
	
//	this keyword constructor
	Cricketer(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String toString() {
		return "name= " + name + "\t team= " + team + "\t age= " + age;
	}
}

public class Constructor {
	public static void main(String[] args) {
		Cricketer c1 = new Cricketer();
		Cricketer c2 = new Cricketer("sacin", "india", 32);
		Cricketer c3 = new Cricketer(c2);
		Cricketer c4=new Cricketer("omkar",25);

		c1.name = "virat";
		c1.team = "india";
		c1.age = 43;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
