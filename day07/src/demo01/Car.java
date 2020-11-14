package demo01;

public class Car implements TechnologyAble {

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("给车换油");
	}

	@Override
	public void changeTire() {
		// TODO Auto-generated method stub
		System.out.println("给车换轮胎");
	}

}
