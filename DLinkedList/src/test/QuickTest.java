package test;

//import java.util.LinkedList;
import java.util.Random;

import sort.QuickSort;

public class QuickTest {

	public static void main(String[] args) {

		/*
		 * Muito útil
		 */
		// LinkedList lk = new LinkedList();
		//
		// lk.addFirst(50);
		// lk.addFirst(70);
		//
		// System.out.println(lk.toString());

		QuickSort sort = new QuickSort();

		int[] array = new int[50];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(500);

		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		sort.quickSort(array);

		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}
}
