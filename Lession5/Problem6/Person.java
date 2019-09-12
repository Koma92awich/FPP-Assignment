package Problem6;

public class Person implements Cloneable {

	 String name;
	 Computer computer;

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
		
		//Person pple3 = (Person)super.clone();
		//pple3.setComputer(Computer)computer.clone();

	}
	
	public Person(String name,Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	

}
