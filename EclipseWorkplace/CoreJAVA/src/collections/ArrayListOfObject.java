package collections;

import java.util.ArrayList;

class Contact {
	String firstName;
	String lastName;
	String PhoneNo;

	public Contact(String fn, String ln, String pn) {
		firstName = fn;
		lastName = ln;
		PhoneNo = pn;
	}

	public String toString() {
		return "\nFirst name: " + firstName + " Last name: " + lastName + " phone number:" + PhoneNo;
	}
}

public class ArrayListOfObject {

	public static void main(String[] args) {
		Contact c1 = new Contact("omkar", "sathe", "7058919412");
		Contact c2 = new Contact("guru", "kamble", "7895122525");
		Contact c3 = new Contact("Vitthal", "mane", "565465468");

		ArrayList<Contact> al = new ArrayList<Contact>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
	}

}
