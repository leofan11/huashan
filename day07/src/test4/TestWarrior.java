package test4;

public class TestWarrior {

	public static void main(String[] args) {

		Warrior warrior = new Warrior();
		BloodWarrior bloodWarrior = new BloodWarrior();
		warrior.setBlood(1000);
		bloodWarrior.setBlood(2000);
        warrior.injure(1500);
        bloodWarrior.injure(600);
	}

}
