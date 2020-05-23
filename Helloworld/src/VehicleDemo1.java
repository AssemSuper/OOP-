class Vehicle {
	int passengers;
	int fuelcup;
	int mpg;}
class VehicleDemo1{ 
	public static  void main(String args[])
	{ Vehicle minivan=new Vehicle();
	int range;
	minivan.passengers=7;
	minivan.fuelcup=16;
	minivan.mpg=21;
	range=minivan.fuelcup*minivan.mpg;
	System.out.println("Minivan can carry"+minivan.passengers+"with a range of "+range);
	}

}
