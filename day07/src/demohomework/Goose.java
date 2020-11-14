package demohomework;

public class Goose extends Bird implements Fly{

	public String name;
	
	
	public Goose(String name) {
		super();
		this.name = name;
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("大雁飞行");
	}

	
	
}
