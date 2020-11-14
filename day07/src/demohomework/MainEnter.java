package demohomework;

public class MainEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animail animail=new Bird();
		Oxygen oxygen=new Oxygen();
		Water water=new Water();
		animail.useOxygen(oxygen);
		animail.useWater(water);
	}

}
