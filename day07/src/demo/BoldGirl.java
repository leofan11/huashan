package demo;

public class BoldGirl extends Girl implements KongfuAble{

	@Override
	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("老铁，咱们来聊5元的天！！！！");
	}

	@Override
	public void kongfu() {
		// TODO Auto-generated method stub
		System.out.println("砰啪砰");
	}

}
