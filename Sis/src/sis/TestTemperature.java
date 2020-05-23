package sis;

 class TestTemperature {public static void main (String args[]) {
	 Temperature conversion= new Temperature(56,'F');
	 System.out.println(conversion.degreeInCelsius());
	 conversion.setScale('C');
	 System.out.println(conversion.getScale());
	 System.out.println(conversion.degreeInFahrenheit());
	 
 }
	

}
