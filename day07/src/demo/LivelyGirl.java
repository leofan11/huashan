package demo;

public class LivelyGirl extends Girl implements singAble,DanceAble{

	
	public void introduce() {
        // TODO Auto-generated method stub
        System.out.println("O(∩_∩)O哈哈~，我是活泼型女孩！！！！!");
}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("交际舞");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("唱歌巴啦啦");
	}
}