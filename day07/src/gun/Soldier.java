package gun;

public class Soldier {

	public String name;

	public int age;
	public char gender;

	public Soldier(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void attack(Weapon w) {
		w.fire();
	}
	
	public  Gun pickGun (BattleField b) {
		
		int index=(int)( Math.random()*4);
		return b.gun[index];
		
	}
	public void attack(Artllery a) {
		 a.fire();
	}
	
	public void attack(Tank b) {
		 b.fire();
	}
	
	public void attack(Cfq c) {

		c.fire();
	}

	public void attack(Sq c) {

		c.fire();
	}

	public void attack(Bq c) {

		c.fire();
	}

	public void attack(Jjq c) {

		c.fire();
	}
	@Override
	public String toString() {
		return "士兵 [姓名是" + name + ", 年龄是" + age + ", 性别是" + gender + "]";
	}

	
}
