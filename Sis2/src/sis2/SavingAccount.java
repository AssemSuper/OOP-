package sis2;

public class SavingAccount extends Account {
	//Account acc;
	double interestRate;
	double balance;
	
	public SavingAccount(double b, int a,double balance ){
		super(a,balance);
		interestRate=b;
		
	}
	public double  addInRateToAcc() {
		balance=getBalance()+interestRate;
		return balance;
		  
	}
	

}
