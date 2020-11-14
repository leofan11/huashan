package demotest;

public class Car extends Vehicle {

	public int numOfDoors;

	public Car(int d, int w) {
		super(w);
	numOfDoors = d;
	}

	public void drive() {
	System.out.println("驾驶一辆小汽车");
	}
}
