package demo3;

public class MainEnter {

	public static void main(String[] args) {

		
		Rabbit rabbit=new Rabbit("兔子", "白", '1', "短毛");
		Frog frog=new Frog("青蛙", "绿色", '1');
		Snake snake=new Snake();
		
		System.out.println(rabbit);
		rabbit.eat();
		rabbit.jump();
		System.out.println(frog);
		frog.eat();
		frog.jump();
		frog.sing();
		
		
		snake.eatAble(frog);
	}

}
