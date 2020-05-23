package sis2;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a,double balance ) {
		balance=0.0;
		accNumber=a;}
	public void deposit(double sum) {
		balance=balance+sum;
		
	}
	public void withdraw(double sum) {
		balance=balance-sum;
		
	}
	public double getBalance() {
		return balance;
	}
	public double getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount,Account other ) {
		withdraw(amount);
		other.deposit(amount);
		
	}
	public String toString() {
		return String.format("balance is %d", balance);
		
	}
	public final void print() {
		System.out.println(toString());		
	} 
	/*public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false ;
		
		Account p= (Account) o;
		balance.equals(p.balance);
	}*/
}