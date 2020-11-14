package demo3;



public class Snake {

	public void eatAble(singAble sing) {
		
		if(sing instanceof Frog) {
			Frog frog=(Frog)sing;
			System.out.println("我要吃掉会唱歌的"+frog+"的sb");
			frog.help();
		}
	}
	
}
