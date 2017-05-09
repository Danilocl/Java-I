
public class Foreach {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i = i + 1) {

			for (int j = 0; j < 10; j = j + 1) {

				System.out.println("i:" + i);

				System.out.println("");

				System.out.print("j:" + j);

				System.out.print("|");

			}
		}

		System.out.println();
	}
}