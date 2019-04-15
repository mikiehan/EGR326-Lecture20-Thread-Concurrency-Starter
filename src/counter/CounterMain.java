package counter;

import java.util.ArrayList;
import java.util.List;

/**
 * This class has a main method that creates many threads to modify a shared
 * counter.  If there are enough threads modifying the same counter and the
 * counter is not thread safe, the counter's value will not be what is expected (0).
 * The program serves to demonstrate the importance of thread safety. 
 */

public class CounterMain {
	private static final int NUM_THREADS = 400;
	private static final int MUTATIONS_PER_THREAD = 100;
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < NUM_THREADS; i++) {
			//Implement this

		}
		
		while (anyThreadAlive(threads)) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException ie) {}
		}
		
		System.out.println("After " + NUM_THREADS + " each performed " + MUTATIONS_PER_THREAD + " mutations:");
		System.out.println("Counter's value is " + counter.value());
	}
	
	private static boolean anyThreadAlive(List<Thread> list) {
		for (Thread t : list) {
			if (t.isAlive()) {
				return true;
			}
		}
		return false;
	}
}
