package sis2;

public class ArrayInOb {
	private Person2[] a;
	private int nElems;
	public ArrayInOb(int max ) {
		a= new Person2[max];
		nElems=0;
	}
	public void insert(String lastName,String firstName,int age) {
		a[nElems]= new Person2(lastName,firstName,age);
		nElems++;
	}
	public void display() {
		for(int j=0;j<nElems;j++) {
			a[j].displayPerson();
			System.out.println(" ");
		}
		
	}
	public void insertionSort() {
		int in,out;
		for(out=1;out<nElems;out++) {
			Person2 tem=a[out];
			in=out;
			while(in>0 && a[in-1].getLastName().compareTo(tem.getLastName())>0) {
				a[in]=a[in-1];
				--in;
			}
			a[in]=tem;
			
		}
	}

}
