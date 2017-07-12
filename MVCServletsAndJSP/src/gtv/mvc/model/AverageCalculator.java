package gtv.mvc.model;

public class AverageCalculator {

	public AverageCalculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getResult() {
		return ((num1 + num2) / 2);
	}

	int num1;
	int num2;

}
