package test1;

public class Rectangle extends Shape {

	private String name="矩形";
	private int long1;
	private int wide;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLong1() {
		return long1;
	}

	public void setLong1(int long1) {
		this.long1 = long1;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	@Override
	public void getLength1() {
		// TODO Auto-generated method stub
		System.out.println(name+"周长等于" + (long1 + wide) * 2);
	}

	@Override
	public void getArea1() {
		// TODO Auto-generated method stub
		System.out.println(name+"面积等于" + (long1 * wide));
	}

}
