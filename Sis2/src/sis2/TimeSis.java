package sis2;


import lab3.Time1;
public class TimeSis implements Comparable  {
	public int minute,second,hour;

	@Override
	public int compareTo(Object arg0) {
		Time1 otherArg= (Time1) arg0;
		// TODO Auto-generated method stub
		if(hour<otherArg.hour) return -1;
		if(hour<otherArg.hour) return 1;
		if(minute<otherArg.minute) return -1;
		if(minute>otherArg.minute) return 1;
		if(second<otherArg.second) return -1;
		if(second>otherArg.second) return 1;
		return 0;
	}
	

}
