package problem3;

public class Data { double largestValue=0;
double storeValue=0;
int numberOfValue=0;
public void addValue() {
	numberOfValue++;
	storeValue=storeValue+numberOfValue;
	if (numberOfValue>largestValue) {largestValue=numberOfValue;}
}

public double maxValue() {return largestValue;}
public double  avg() {return storeValue/numberOfValue;} 

}
