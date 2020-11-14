package demo;

import java.util.Scanner;

public class MainEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boy boy = new Boy();
		System.out.println("请妈妈安排女孩：");
		Scanner scanner = new Scanner(System.in);
		int income = scanner.nextInt();
		Girl girl = null;

		switch (income) {
		case 1:
			girl = new GentleGirl();
			break;

		case 2:
			girl = new BoldGirl();
			break;
		case 3:
			girl = new LivelyGirl();
			break;

		default:
			break;
		}
		boy.xiangQin(girl);
		scanner.close();
	}

}
