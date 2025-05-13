package Miniproject;

import java.util.ArrayList;

public class Account {
	
	private double balance;
	private ArrayList<String> transactionhistory;
	
	public Account() {
		this.balance=0.0;
		this.transactionhistory= new ArrayList<>();
		
		
	}
	
	public void deposite(double amount) {
		balance+=amount;
		System.out.println("Transaction Sucessfull "+amount+ " deposited ");
		transactionhistory.add(" amount " +amount+" deposited");
	}
	
	public boolean withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Transaction Sucessfull "+amount+ " withdraw ");
			transactionhistory.add(" amount " +amount+" withdraw");
			return true;
			
		}
		return false;
		
	}
	
	public boolean transfer(Account toaccount, double amount) {
		if(withdraw(amount)) {
			toaccount.deposite(amount);
			System.out.println("Transaction Sucessfull "+amount+ " deposited to account ");
			transactionhistory.add(" amount " +amount+" deposited to account "+toaccount );
			return true;
		}
		return false;
	}
	
	public void transactionhistory() {
		if(transactionhistory.isEmpty()) {
			System.out.println("Empty");
		}else {
			for(String records:transactionhistory) {
				System.out.println(records);
			}
		}
	}

	public double getBalance() {
		return balance;
	}

	
	

}
