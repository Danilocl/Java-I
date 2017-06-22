package varargs;

public class Main {

	public static int average(int a, int c, int b, int... others) {

		int result = a + b;
		for (int other : others) {
			result += other;
		}
		int average = result / (2 + others.length);
		return average;

	}

	public static void main(String[] args) {
		System.out.println((average(3, 6, 7, 8)));

	}
}
