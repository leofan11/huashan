package day07;

public class Math {

	
	
	
	public int sum(int...nums) {
		
		int sum=0;
		int lenth=nums.length;
		for(int i=0;i<lenth;i++) {
			sum+=nums[i];
		}
		return sum;
		
	}
	
	
	public int add(int a, int b) {
		return a + b;
	}

	public int cut(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}

	public int divi(int a, int b) {
		return a / b;
	}

}
