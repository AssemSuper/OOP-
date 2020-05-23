package sis2;

public class ClassObjectSortApp {
	public static void main(String args[]) {
		int maxSize=100;
		ArrayInOb arr= new ArrayInOb(maxSize);
		arr.insert("Kuandykova", "Assem", 20);
		arr.insert("Creswell", "Lucinda", 18);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Velasquez", "Jose", 72);
		System.out.println("Before Sorting:");
		arr.display();
		arr.insertionSort();
		System.out.println("After sorting");
		arr.display();
	}

}
