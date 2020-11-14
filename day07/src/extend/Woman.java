package extend;

public class Woman {

	public String name;
	public int age;
	public int height;
	public int weight;

	public Woman(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Woman woman = (Woman) obj;
		if (this.height == woman.height&&this.weight == woman.weight) {
			return true;
		} else {
			return false;
		}		
		
		
	}

}
