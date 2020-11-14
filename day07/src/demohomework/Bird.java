package demohomework;

public class Bird extends Animail {

	

	public Wing[] wings;
	
	public Bird() {
		wings=new Wing[2];
		wings[0]=new Wing();
		wings[1]=new Wing();
	}
	
	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		System.out.println("蛋繁殖");
	}
	
	
	
}
