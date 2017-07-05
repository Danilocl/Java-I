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
			 * se o array na posição meio for igual ao indice procurado, ele irá
			 * retornar true
			 */
			if (array[middle] == key) {
				return true;
			}
			/**
			 * se a chave for menor que a posição "meio", a referêmcia da ultima
			 * posição será atualizad
			 * 
			 */
			if (key < array[middle]) {
				last = middle - 1;
				/**
				 * senão a referência do primeiro será o próxima do meio.
				 */
			} else {
				first = middle + 1;
			}
		}
		return false;
	}
}
