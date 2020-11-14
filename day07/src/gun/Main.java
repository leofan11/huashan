package gun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Soldier s1=new Soldier("许三多",18,'1');
		
		BattleField ba=new BattleField("刺激战场");
		//士兵捡枪，武器自动开火
		Weapon w=s1.pickGun(ba);
		w.fire();
		//士兵先捡枪，然后士兵再开火
		s1.attack(s1.pickGun(ba));
//		System.out.println(s1.pickGun(ba));
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入你需要使用的武器：1.坦克2.火炮3.手枪4.冲锋枪5.步枪6.狙击枪");
//		int income=scanner.nextInt();
//		
//		Weapon weapon=null;
//		switch (income){
//			
//		case 1:
//			weapon=new Tank();
//			break;
//		case 2:
//			weapon=new Artllery();
//			break;
//			
//		case 3:
//			weapon=new Sq();
//			
//				break;
//		case 4:
//			weapon=new Cfq();
//			
//				break;
//		case 5:
//			weapon=new Bq();
//			
//				break;
//		case 6:
//			weapon=new Jjq();
//			
//				break;
//		default:
//			break;
//		}
//		s1.attack(weapon);
//		scanner.close();
//			
//		}
//		
		
		
//		Sq sq=new Sq();
//		Cfq cfq=new Cfq();
//		Jjq jjq=new Jjq();
//		Bq bq=new Bq();
//		Artllery a=new Artllery();
//		Tank t=new Tank();
//		s1.attack(t);
//		s1.attack(a);
//		
//		s1.attack(bq);
//		s1.attack(jjq);
//		s1.attack(sq);
//		s1.attack(cfq);
		
		
//		 System.out.println(s1);
	}

}
