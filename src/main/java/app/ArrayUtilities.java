package app;

public class ArrayUtilities {

	public static int maximum(int[] array) {
		int maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}
		return maximum;
	}

	public static int[] random(int minimum, int maximum, int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = Random.generate(minimum, maximum);
		}
		return array;
	}

}