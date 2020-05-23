package sis2;

public class BubbleSortApp {
	public static void main(String args[]) {
		int maxSize=100;
		ArrayBub arr;/// reference to array
		arr= new ArrayBub(maxSize);
		arr.insert(77);
		arr.insert(87);
		arr.insert(107);
		arr.insert(7);
		arr.insert(1);
		arr.insert(6);
		arr.insert(5);
		arr.insert(73);
		arr.insert(75);
		arr.insert(76);
		arr.display();
		arr.bubleSort();
		arr.display();
	}

}
