package aggregation;

class Author {
	private String name;
	private int age;
	private String place;

	public Author(String name, int age, String place) {
		this.name = name;
		this.age = age;
		this.place = place;
	}

	public String getAuthName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPlace() {
		return place;
	}
}

public class Book {

	String bookName;
	int price;
	Author auth;

	Book(String bookName, int price, Author auth) {
		this.bookName = bookName;
		this.price = price;
		this.auth = auth;
	}

	public void showDetails() {
		System.out.println("book name=" + bookName);
		System.out.println("price= " + price);
		System.out.println("Author name= " + auth.getAuthName());
		System.out.println("Author age= " + auth.getAge());
		System.out.println("Author place= " + auth.getPlace());
	}

	public static void main(String[] args) {
		Author auth = new Author("omkar", 25, "india");
		Book b = new Book("spartan", 2500, auth);
		b.showDetails();
	}
}
