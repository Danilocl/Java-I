package testearray;

import java.util.Random;

public class Mainapp {
	public static void main(String[] args) {
		float[] array = new float[10];
		Random valor = new Random(50);
		array[0] = 55.55f;

		for (int i = 0; i < array.length; i++) {
			array[i] = valor.nextFloat();
			System.out.println(array[i]);
		}

	}
}
