package test4;

public class BloodWarrior extends Warrior {

	
	
	public int injure(int x) {
		// TODO Auto-generated method stub
		int blood = getBlood() - x;
		if (blood < MAX / 2) {
			System.out.println("危險");
		}
		return blood;
	}
}