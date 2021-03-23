public class Account {
	
	private String accountName;
	private   double balance;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getOpeningBalance() {
		return balance;
	}

	public void setOpeningBalance(double balance) {
		this.balance = balance;
	}

	public void addMoney (double amount) {
		this.balance += amount;
	}
	public Account(String accountName, double balance) {
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public String toString() {
		return (accountName + ": " + balance);
	}

}
