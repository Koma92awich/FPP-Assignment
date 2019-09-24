package lesson12exceptionhandling.logging;

public class CustomerException extends Exception {

	public CustomerException() {
		super();
	}

	public CustomerException(String message) {

		super();
		System.out.println(message);

	}

}
