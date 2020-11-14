package extend;

import day07.Bike;

public class Person {

	public String name;
	public String dna;
	public int gender;
	public int age;

	public void eat() {
		System.out.println("吃大米");
	}

	public void goHome() {
		System.out.println("走路回家！！！");
	}

	public void goHome(Bike bike) {
		System.out.println("汽车回家！！！");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dna=" + dna + ", gender=" + gender + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		// 预判对象类型是否有误
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (this.dna.equals(person.dna)) {
				return true;
			}
		}
		return false;
	}
}
