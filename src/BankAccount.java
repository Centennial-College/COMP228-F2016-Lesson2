
public class BankAccount extends Account {
	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++++++++++++++++
	private double _balance;

	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public BankAccount(String name, double balance) {
		super(name);

		if (balance > 0.0 && balance < 1000000) {
			this._balance = balance;
		}
	}

	// GETTERS AND SETTERS +++++++++++++++++++++++++++++++++++++++++++++++++++
	public double getBalance() {
		return _balance;
	}

	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			_balance += depositAmount;
		}
	}

}
