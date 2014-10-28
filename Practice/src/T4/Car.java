package T4;

public class Car {
	class Wheel{
		
	}
	
}

class PlaneWheel extends Car.Wheel{
	PlaneWheel(Car car){
		car.super();
	}
	
	public static void main(String[] args){
		Car ca = new Car();
		PlaneWheel pw = new PlaneWheel(ca);
	}
}