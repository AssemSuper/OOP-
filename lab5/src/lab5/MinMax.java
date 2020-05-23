package lab5;

public class MinMax {
	 public static class innerClass{
		 int largestValue;
		 int lowestValue;
		public innerClass(int largestValue,int lowestValue) {
			this.largestValue=largestValue;
			this.lowestValue=lowestValue;
		}
		}
	static innerClass minMax(int[] values) {
		
		
		int largestValue=values[0];
		int lowestValue=values[0];
		for(int i=0;i<values.length;i++) {
			if(largestValue<values[i]) largestValue=values[i];
			if(lowestValue>values[i]) lowestValue=values[i];
			
		}
		//return lowestValue+ largestValue;
		return new  innerClass(largestValue,lowestValue);
		
}
}
