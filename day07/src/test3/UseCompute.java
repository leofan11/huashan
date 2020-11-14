package test3;

public class UseCompute {

	public void useCom(Compute com, int one, int two) {
		Add add = new Add();
		Subtraction subtraction = new Subtraction();
		Multiply multiply = new Multiply();
		Division division = new Division();
		System.out.println(add.computer(one, two));
		System.out.println(subtraction.computer(one, two));
		System.out.println(multiply.computer(one, two));
		System.out.println(division.computer(one, two));

	}

}
