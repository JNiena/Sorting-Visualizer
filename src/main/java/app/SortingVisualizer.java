package app;

import app.algorithms.BubbleSort;
import app.algorithms.InsertionSort;
import app.algorithms.SelectionSort;
import app.api.Application;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;

public class SortingVisualizer extends Application {

	private BubbleSort bubbleSort = new BubbleSort();
	private InsertionSort insertionSort = new InsertionSort();
	private SelectionSort selectionSort = new SelectionSort();
	private Thread sortingThread;

	@Override
	public void start() {
		Array array = new Array(ArrayUtilities.random(5, 50, 500), 1920, 1080, Color.LIME, Color.GREEN);
		getRenderer().add(array);
		getKeyboardHandler().bindTappedKey(Input.Keys.R, () -> {
			array.set(ArrayUtilities.random(5, 50, 500));
			sortingThread = new Thread(() -> selectionSort.sort(array.get(), (index) -> {
				array.selectIndex(index);
				try {
					Thread.sleep(100);
				} catch (InterruptedException exception) {
					exception.printStackTrace();
				}
			}));
			sortingThread.start();
		});
	}

	@Override
	public void exit() {
		sortingThread.stop();
	}

}