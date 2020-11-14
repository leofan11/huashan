package demotest;

public class Television {
	/*代码清单7.17 Television.java
	Television类，代表“电视”
	*/

	
	public int channel, volume;         //频道，音量
	public Television(){
	this(4,5);
	System.out.println("在Television()内");
	}

	public Television(int c, int v){
	System.out.println("在Television(int, int)内");
	channel = c;
	volume = v;
	}
	}

