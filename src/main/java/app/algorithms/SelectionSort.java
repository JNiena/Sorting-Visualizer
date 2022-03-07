package app.algorithms;

import app.IterationHandler;
import app.SortingAlgorithm;

public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] array, IterationHandler<Integer> handler) {
		for (int i = 0; i < array.length - 1; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minimumIndex]) {
					minimumIndex = j;
				}
				handler.handle(j);
			}
			int temp = array[i];
			array[i] = array[minimumIndex];
			array[minimumIndex] = temp;
		}
	}

}