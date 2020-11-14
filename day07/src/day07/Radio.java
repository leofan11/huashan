package day07;

public class Radio {

	private int volume;
/**
 * 无返回
 */
	public void turnOn() {
		setVolume(50);
	}
/**
 * 有返回
 * @return
 */
	public int getVolume() {
		return volume;
	}

	public int add(int a,int b) {
		return a+b;
	}
	/**
	 * 重载
	 * @param a
	 * @param b
	 * @return
	 */
	public double add(double a,double b) {
		return a+b;
	}
	
	/**
	 * \ 调整声音
	 * 
	 * @param volume
	 */
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(volume);
	}

}
