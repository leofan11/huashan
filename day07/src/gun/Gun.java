package gun;

public abstract class Gun extends Weapon {

	public int length;
	public int weight;
	public String color;
	public int size;
	@Override
	public abstract void fire();

}
