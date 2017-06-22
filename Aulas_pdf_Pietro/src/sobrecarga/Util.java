package sobrecarga;

public class Util {

	public static int sum(int a, int b) {
		return 0;
	}

	public static float sum(float a, float b) {
		return b + a;

	}

	public static float sum(int a, float b) {
		return b + a;

	}

	public static double sum(double a, double b) {
		return b + a;

	}

	public static float sum(float a, int b) {
		return b + a;

	}

	public static void main(String[] args) {
		System.out.println(Util.sum(2.6, 2));
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
	}
}
