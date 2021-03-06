package newbank.server;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<Account> accounts;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public Customer(String password) {
		accounts = new ArrayList<>();
		this.password = password;

	}
	
	public String accountsToString() {
		String s = "";
		for(Account a : accounts) {
			s += a.toString();
		}
		return s;
	}

	public void addAccount(Account account) {
		accounts.add(account);		
	}

	public boolean checkDupeAccount(Account account){
		for (Account a : accounts){
			if (a.getAccountName().equals(account.getAccountName())){
				return true;
			}
		}
		return false;
	}
}
