//class Time 
public class Time { 
	int hour, minute, second;
	//Constractor
	public Time(int hour,int minute,int second) {
		if(hour>0 && hour<=24 && minute>0 && minute<=60 && second>0 && second<=60 ) {
			this.hour=hour;
			this.minute=minute;
			this.second=second;}

	}
	public void addHMS(Time t) {
		hour=t.hour+hour;
		minute=t.minute+minute;
		second=t.second+second;
	}
	public String toUniversal() {
		return String.format("%02d:%02d:%02d",hour,minute,second);

	}
	public String toStandard() {
		if (hour>12 ) return String.format("%02d:%02d:%02d %s",hour%12,minute,second,"pm");
		else return String.format("%02d:%02d:%02d %s",hour,minute,second,"pm");
	}





}
