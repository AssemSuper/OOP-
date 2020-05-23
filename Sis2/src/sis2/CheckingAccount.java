package sis2;

public class CheckingAccount extends Account{
	Account accc;
	int counter;
	double  balance;
	//public static long NumberOfTransaction=0;
	int FREETRANSACTION=3;
	public CheckingAccount(Account accc,double balance,int a ) {
		super(a,balance);
		this.accc=accc;
		
	}
	public void deposit(double sum) {
		balance=getBalance()+sum;
		
	}
	public void withdraw(double sum) {
		balance=getBalance()-sum;
	}
	public void  deductFee() {
		for(int counter=0;counter<=FREETRANSACTION;counter++) {
			if(counter==0) {
			withdraw(0.2);
			}
		}
		
		}
		
	}


