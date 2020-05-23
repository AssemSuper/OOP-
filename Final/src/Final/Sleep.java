package Final;

public class Sleep {
	int lastNum=100;
	
	public Sleep() {
		
	}
	public void run() {
		for(int i=0;i<=lastNum;i++) {
			System.out.println(" "+i);
			try {
				if(i>=50) Thread.sleep(1000);
				}
			catch (InterruptedException ex) {
				
			}
			
		}
	}

}
