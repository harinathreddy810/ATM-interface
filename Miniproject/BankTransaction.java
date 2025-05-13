package Miniproject;

public class BankTransaction {

	private AccountHolder holder;
	private Account account;
	
	public BankTransaction(AccountHolder holder, Account account) {
		this.holder=holder;
		this.account=account;
	}

	
	
	public void deposite(double amount) {
		account.deposite(amount);
	
	}
	
	public boolean withdraw(double amount) {
		return account.withdraw(amount);
	}
	
	public boolean transfer(Account toaccount ,double amount) {
		return account.transfer (toaccount , amount);
		
	}
	public double getBalance() {
		return account.getBalance();
	}

	public void showHistory() {
		account.transactionhistory();
		
	


}
}
