
 class TimeTest {
	 public static void main (String args[]) {
		 Time test= new Time(23,5,6);
		 System.out.println(test.toUniversal());
		 System.out.println(test.toStandard());
		 Time test1= new Time (4,24,33);
		  test.addHMS(test1);
	 }

}
