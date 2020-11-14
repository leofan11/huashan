package test1;

public class Circle extends Shape {
    
	private String name="圆形";
	private int ride;
	private final double pie = 3.1415;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRide() {
		return ride;
	}

	public void setRide(int ride) {
		this.ride = ride;
	}

	public double getPie() {
		return pie;
	}

	public Circle(int ride) {

		this.ride = ride;
	}

	@Override
	public void getLength1() {
		// TODO Auto-generated method stub
		System.out.println(name+"周长等于" + (ride * pie) * 2);
	}

	@Override
	public void getArea1() {
		// TODO Auto-generated method stub
		System.out.println(name+"面积等于" + (ride * ride) * 2);
	}

	
}
