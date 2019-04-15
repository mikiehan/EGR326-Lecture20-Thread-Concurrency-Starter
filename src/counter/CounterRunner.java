package counter;
import java.util.Random;

/**
 * A Runnable task to increment or decrement a Counter a given number of times.
 * Many of these will be created in threads.
 */

public class CounterRunner{
	private static final Random RANDOM = new Random(42);
	private Counter counter;
	private int times;
	private boolean increment;
	
	public CounterRunner(Counter counter, int times, boolean increment) {
		this.counter = counter;
		this.times = times;
		this.increment = increment;
	}

}
