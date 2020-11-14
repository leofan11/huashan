package demotest;


	/*代码清单7.18 BigScreenTV.java
	BigScreenTV继承Television类，代表“大屏幕电视”
	*/

	public class BigScreenTV extends Television{
	public String aspectRatio;   //长宽比
	public short size;             //尺寸
	public BigScreenTV(){
	super();
	aspectRatio = "unknown";
	size = 40;
	System.out.println("在BigScreenTV()内");
	}
	}

