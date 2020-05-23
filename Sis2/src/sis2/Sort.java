package sis2;

public class Sort   {
	private Chocolate[] a;
	private int nElems;
	int weights;
	public Sort(int max ) {
		super(weights, name);
		a= new Chocolate[max];
		nElems=0;
	}
	public void insert(int weight,String name) {
		a[nElems]= new Chocolate(weight,name);
		nElems++;
	}
	public void display() {
		for(int j=0;j<nElems;j++) {
			a[j].displayChocolate();
			System.out.println(" ");
		}
		
	}
	public void insertionSort() {
		int in,out;
		for(out=1;out<nElems;out++) {
			Chocolate cho=a[out];
			in=out;
			while(in>0 && a[in-1].getWeights().compareTo(cho.getWeights())>0) {
				a[in]=a[in-1];
				--in;
			}
			a[in]=cho;
			
		}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Sort sort= (Sort) o;
		if(weights<sort.getWeights()) return -1;
		if(weights>sort.getWeights()) return 1;
		return 0;
	}

}
