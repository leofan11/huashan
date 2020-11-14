package day07;

public class Person {

	public void goHome() {
		System.out.println("使用11路公交车回家");
	}
	
	public void goHome(Bike bike) {
		System.out.println("骑车回家");
		
	}
	
	public void goHome(Car car) {
		System.out.println("开车回家");
		
	}
	public void goHome(Car car,Bike bike) {
		System.out.println("先开车，再骑车回家");
		
	}
	public void goHome(Bike bike,Car car) {
		System.out.println("先骑车，再开车回家");
		
	}
	
	public static void main(String[] args) {
		Person person1=new Person();
		
		person1.goHome();
		
		person1.goHome(new Bike());
		person1.goHome(new Car());
	}
}
