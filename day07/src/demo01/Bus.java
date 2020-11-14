package demo01;




public class Bus implements TechnologyAble {

	@Override
	public void changeTire() {
		// TODO Auto-generated method stub
		System.out.println("给大巴车换轮胎");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("给大巴车换机油");
	}

}
