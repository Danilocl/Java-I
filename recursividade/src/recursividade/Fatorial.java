package recursividade;

public class Fatorial {
	/**
	 * Calcular o valor fatorial de num
	 * 
	 * @param num
	 * @return
	 */
	public static int fat(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fat(num - 1);
	}

	/**
	 * Chama o m�todo fat e passa o valor 6 � ser fatorado
	 */
	public static void main(String[] args) {
		Fatorial f = new Fatorial();
		System.out.println(f.fat(6));
	}
}
