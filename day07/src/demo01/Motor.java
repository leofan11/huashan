package demo01;

public class Motor implements OilAble,TireAble{

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("给摩托车换轮胎");
	}

	@Override
	public void changeTire() {
		// TODO Auto-generated method stub
		System.out.println("给摩托车换轮胎");
	}

	
	
	
}
