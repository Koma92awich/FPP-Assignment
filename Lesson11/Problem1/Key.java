package prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(!(obj instanceof Key)) return false;
		
		Key keys = (Key)obj;
		
		return this.firstName.equals(keys.getFirstName()) && this.lastName.equals(keys.getLastName());
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(firstName,lastName);
	}
}
