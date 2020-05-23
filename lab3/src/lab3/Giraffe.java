package lab3;

public class Giraffe extends Animal {
	public int move (int velocity,int time, int acceleration) {
		return (int) ((Math.pow(velocity, 2))/(2 * time * acceleration));	
	}
	public int move(int velocity,int time) {
		return super.move(velocity,time) / 3;
	}
	public String sleepingPattern(String pattern) {
		return String.format("%s in this %s pattern",super.sleepingPattern(),pattern);
		
	}
	public String sleepingPattern() {
		return String.format("%s hum!",super.sleepingPattern());
	}

}
