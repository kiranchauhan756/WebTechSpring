package stragedy.kiet.edu;

public class Context {
	private Stragedy stragedy;

	public Context(Stragedy stragedy) {
		this.stragedy = stragedy;
	}

	public float executeStragedy(float num1, float num2) {
		return stragedy.calculation(num1, num2);
	}
}
