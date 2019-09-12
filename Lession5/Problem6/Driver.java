package Problem6;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person pple1 = new Person("Godfrey", new Computer("HP", "Intel", 9, 78.0));

		// Creating a copy of object pple1 and passing it to pple2
		
		
		Person pple2 = (Person) pple1.clone();
		
		

	//	pple2.computer.processor = "Corei7";

		/**
		 * Changing the Object type field will be reflected in both pple2 and pple1.
		 * this is Shallow copy cloning
		 */

		pple1.setName("God");
		System.out.println(pple1.name + " " + pple1.computer.manufacturer + " " + pple1.computer.processor);
		System.out.println(pple2.name + " " + pple2.computer.manufacturer + " " + pple2.computer.processor);

	}

}
