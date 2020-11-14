package test1;



public class TestShape {

	public static void compute(Shape e) {
		e.setArea(5);
		e.setLength(6);
		Rectangle r = new Rectangle();
		Circle c = new Circle(4);
		r.setLong1(1);
		r.setWide(3);
		r.getLength();
		r.getArea();
		c.getLength();
		c.getArea();
		Cone v = new Cone();
		System.out.println(e.getLength());
		System.out.println(e.getArea());
		
		System.out.println("锥体体积为" + (v.bottom * v.height) / 3);
	}

	public static void main(String[] args) {

		Rectangle rectangle=new Rectangle();
		compute(rectangle);

		Circle circle=new Circle(0);
		compute(circle);
	}

}
