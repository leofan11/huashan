package girl;

public abstract class Girl {

	public String girlName;
	public int age;
	public int height;
	public int weight;
	
	public Girl() {
		
	}
	
	public abstract void cry();
	
	public abstract void smile();
	
	public void sleep() {
		
		System.out.println("睡觉！！！");
	}
	

}
