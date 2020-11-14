package test1;

public abstract class Shape {

	private int length;
	private int area;

	public void setLength(int length) {
		this.length = length;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getLength() {
		return length;
	}

	public int getArea() {
		return area;
	}

	public abstract void getLength1();

	public abstract void getArea1();

}
