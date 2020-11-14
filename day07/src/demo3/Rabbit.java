package demo3;

public class Rabbit extends Animail  {
	
	
	public String fur;
	
	public Rabbit(String name,String color,char gender,String fur) {
		super();
		this.color=color;
		this.name=name;
		this.gender=gender;
		this.fur=fur;
	}

	public Rabbit() {
		super();
	}
	
	
	
	public Rabbit(String fur) {
	super();
	this.fur = fur;
}



	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("菜叶子");
	}


	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("兔子跳");
	}



	@Override
	public String toString() {
		return "Rabbit [fur=" + fur + ", name=" + name + ", color=" + color + ", gender=" + gender + "]";
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("小兔子冲击！！");
	}
	
}
