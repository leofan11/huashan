package demo3;

public class Frog extends Animail implements singAble {

	
	
	


	public Frog(String name,String color,char gender) {
		super();
		this.color=color;
		this.name=name;
		this.gender=gender;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("呱呱呱");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃虫");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("青蛙跳");
	}

	@Override
	public String toString() {
		return "Frog [name=" + name + ", color=" + color + ", gender=" + gender + "]";
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("青蛙喷水！！");
	}

}
