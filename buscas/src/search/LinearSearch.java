package search;

public class LinearSearch {
	/**
	 * Busca Linear. o m�todo ir� percorre todo array e compara cada posi��o com o key
	 * @param array
	 * @param key
	 * @return
	 */
	public boolean LinearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}
}
