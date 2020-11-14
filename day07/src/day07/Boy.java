package day07;

public class Boy {

	public String name;
	public char gender;
	public Girl gf;

	Girl girl = new Girl(name, gender);

	public Boy(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public void sendFlower(Girl girl) {

		System.out.println(this.name + "向" + girl.name + "送花");

	}

	public void buildRelation(Girl gril) {
		this.gf=gril;
		
	}
}
