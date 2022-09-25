
public class StudentClass {
	String name;
	int age;
	String address;

	public StudentClass(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return ("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nAddress: " + this.getAddress());
	}

	public static void main(String[] args) {
		StudentClass s = new StudentClass("omkar", 25, "Anur dist: Kolhapur");
		System.out.println(s.toString());
	}
}
