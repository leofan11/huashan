package demo3;

public abstract class Animail {

	public String name;
	public String color;
	public char gender;
	
	
	
	public Animail() {
		super();
	}
	
	public Animail(String name, String color, char gender) {
		super();
		this.name = name;
		this.color = color;
		this.gender = gender;
		
	}
	public abstract void eat();
	public abstract void jump();
	public abstract void help();
	
}
