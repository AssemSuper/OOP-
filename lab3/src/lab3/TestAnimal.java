package lab3;

public class TestAnimal {
	public static void main(String args[]) {
		Giraffe tall=  new Giraffe();
		System.out.println(tall.move(50, 4,5));
		System.out.println(tall.sleepingPattern());
		System.out.println(tall.sleepingPattern("Standing up"));
	}

}
