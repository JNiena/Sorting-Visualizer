package app;

public class Random {

	private static java.util.Random random = new java.util.Random();

	public static int generate(int minimum, int maximum) {
		return random.nextInt(maximum + 1 - minimum) + minimum;
	}

}