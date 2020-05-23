package sis2;
import java.util.Vector;

public class Bank  {
	Vector <Account> money = new Vector<Account>(); 
	int sum;
	
	public void update() {
		for (Account acc:money) {
			acc.withdraw(sum); 
			if(acc instanceof SavingAccount) {
				SavingAccount s = (SavingAccount )acc;
			s.addInRateToAcc();}
			if (acc instanceof CheckingAccount) {
				CheckingAccount c=(CheckingAccount) acc;
				c.deductFee();
			}
		}
		
		/*for(int i=0;i<money.size();i++) {
			 money.get(i).deposit(5000);		}
	*/}
	public void  openAccount(Account ac) {
		money.add(ac);
		
	}
	public void closeAccount(Account ac) {
		money.remove(ac);
	}
	

}
