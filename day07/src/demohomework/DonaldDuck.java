package demohomework;

public class DonaldDuck extends Duck implements Speak{

	public String name;

	public DonaldDuck(String name, String name2) {
		super(name);
		name = name2;
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(name+ "：没人比我更懂说话！！！");
	}
	

}
