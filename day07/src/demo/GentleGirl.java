package demo;

public class GentleGirl extends Girl implements singAble{

	public void introduce() {
		System.out.println("小哥哥，我是温柔型女孩哦");
	}

	@Override
	public void sing() {
		System.out.println("唱歌啦啦啦");
		
	}
	
}
