package sis;

public class Temperature {
	 private double temperatureValue=0;
	 private char forTheScale='C';
	 
	 Temperature(char forTheScale){
		 this.forTheScale=forTheScale;
	 }
	 Temperature(double temperatureValue){
		 this.temperatureValue=temperatureValue;
	 }
	 Temperature(double temperatureValue,char forTheScale){
		 this.temperatureValue=temperatureValue;
	 this.forTheScale=forTheScale;
	 
	 }
	 Temperature(){}
	 
	 public double  degreeInCelsius() {
		 if (forTheScale=='F')
		 return temperatureValue=5*(temperatureValue-32)/9;
	return temperatureValue;
	}

	public double degreeInFahrenheit() {
		if(forTheScale=='C')
		return temperatureValue=(9*(temperatureValue/5)+32);
	return temperatureValue;
	}
	public void   setValue(double value) {temperatureValue=value;}
	public void setScale(char scale) {forTheScale=scale;}
	public void setBoth(double temperatureValue,char forTheScale) 
	{
		this.temperatureValue=temperatureValue;
	this.forTheScale=forTheScale;}
	public char  getScale() 
	{
		return forTheScale;
		}
	
	
		 
	 

}
