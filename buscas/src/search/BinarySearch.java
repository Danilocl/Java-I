package search;

public class BinarySearch {

	public boolean binarySearch(int[] array, int key) {

		int first = 0;
		int last = array.length - 1;
		int middle = (first + last) / 2;

		/**
		 * Enquanto o primeiro indice for menor que o ultimo
		 */
		while (first <= last) {
			/**
			 * se o array na posi��o meio for igual ao indice procurado, ele ir�
			 * retornar true
			 */
			if (array[middle] == key) {
				return true;
			}
			/**
			 * se a chave for menor que a posi��o "meio", a refer�mcia da ultima
			 * posi��o ser� atualizad
			 * 
			 */
			if (key < array[middle]) {
				last = middle - 1;
				/**
				 * sen�o a refer�ncia do primeiro ser� o pr�xima do meio.
				 */
			} else {
				first = middle + 1;
			}
		}
		return false;
	}
}
