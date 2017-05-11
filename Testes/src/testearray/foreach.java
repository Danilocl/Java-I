package testearray;

public class foreach {
	public static void main(String[] args) {

		int[] array = new int[5];
		array[0] = 5;
		array[1] = 6;
		array[2] = 7;
		array[3] = 8;
		array[4] = 9;
		
		for (int number : array) {
			System.out.println(number);
		}
	}
}
