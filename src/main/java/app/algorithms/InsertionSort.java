package app.algorithms;

import app.IterationHandler;
import app.SortingAlgorithm;

public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array, IterationHandler<Integer> handler) {
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
				handler.handle(i);
			}
			array[i + 1] = key;
		}
	}

}