package test2;

public class Prime extends Number {

	@Override
	public void method() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}

		}

	}

}