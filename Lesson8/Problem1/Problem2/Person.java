package Lists;

import java.util.Objects;

public class Person {

	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}

	// --------------------------------------------------------------

	public String getLast() { // get last name
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person person = (Person) obj;
		return lastName.equals(person.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lastName);
	}

}
