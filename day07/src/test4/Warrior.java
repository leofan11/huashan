package test4;

public class Warrior implements Fightable {

	private int experience;
	private int blood;

	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	@Override
	public void win() {
		// TODO Auto-generated method stub
		experience++;
	}

	@Override
	public int injure(int x) {
		// TODO Auto-generated method stub
		blood=blood-x;
		if (blood < MAX) {
			System.out.println("危險");
		}
		return blood;
	}

}
