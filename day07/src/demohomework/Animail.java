package demohomework;

public abstract class Animail {

	public int health=500;
	
	public void useWater(Water w) {
          int w1= w.wat;
		System.out.println("每天消耗"+w1+"ml水");
		
		
	}

	public void useOxygen(Oxygen o) {
		  int o1=o.oxy;
		System.out.println("每天消耗"+o1+"ml空气");
	}
	
	public abstract void reproduce() ;

	
	
}
