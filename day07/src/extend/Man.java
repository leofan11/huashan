package extend;

public class Man {

	public String name;
	public int age;
	public int height;
	public int weight;
	public Woman woman;
	
	
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	
	public void findWoman(Woman...womans) {
		int lenth=womans.length;
		for(int i=0;i<lenth;i++) {
			
			if(this.woman.equals(womans[i])) {
				System.out.println("我找到秋香了！！！");	
				break;
			
		}
		
			
	}

	}
}
