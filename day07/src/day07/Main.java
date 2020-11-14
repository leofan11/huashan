package day07;

public class Main {

	public static void main(String[] args) {
		Boy boy1=new Boy("老王",'男');
		Girl girl1=new Girl("思思",'女');
		
		girl1.coquety(boy1);
		boy1.sendFlower(girl1);
		girl1.smile(boy1);
		
		boy1.buildRelation(girl1);
		girl1.buildRelation(boy1);
		
		System.out.println(boy1.name+"的女朋友是"+boy1.gf.name);
	}

}
