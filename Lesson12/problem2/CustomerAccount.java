package lesson12exceptionhandling.logging;

public class CustomerAccount {

	public static <E> void main(String[] args) throws CustomerException {

		CustomerAccount acct = new CustomerAccount("GODFREY", "1234556", 3000.0);
		acct.deposit(1000.0);
		acct.withdraw(5000.0);

	}

	private String Cus_name;
	private String Acc_No;
	private double Balance;

	public CustomerAccount(String Cus_name, String Acc_No, double Balance) {

		this.Acc_No = Acc_No;
		this.Balance = Balance;
		this.Cus_name = Cus_name;
	}

	public void deposit(double amount) throws CustomerException {

		this.Balance += amount;

		if (this.Balance < 100)
			throw new CustomerException("Balnce is below $100");
	}

	public void withdraw(double amount) throws CustomerException {

		if (this.Balance < amount)
			throw new CustomerException("Amount withdrawn exceeds available balance");

		else
			this.Balance -= amount;
	}

}




