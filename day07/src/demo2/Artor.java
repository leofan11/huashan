package demo2;

public class Artor implements singAble,moiveAble,anchorAble{
 
	
	public String name;
	public char gender;
	public int age;
	
	
	
	public Artor(String name, char gender, int age) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public void anchor() {
		// TODO Auto-generated method stub
		System.out.println("大家好，我是时长二年半的练习生！！");
	}
	@Override
	public void movie() {
		// TODO Auto-generated method stub
		System.out.println("《完美假妻168》");
	}
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("鸡你太美！！！！");
	}
	@Override
	public String toString() {
		return "Artor [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
