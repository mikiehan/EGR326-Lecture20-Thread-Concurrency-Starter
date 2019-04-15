package counter;

/**
 * This counter can be incremented and decremented.
 * We synchronized the mutator methods to make sure that multiple threads
 * can't be changing the value at the same time.
 * This makes the class thread safe.
 */
public class Counter {
    private int c;
    
    public Counter() {
        c = 0;
    }
    
    public void increment() {
        int old = c;
        c = old + 1;    // c++;
    }
    
    public void decrement() {
        int old = c;
        c = old - 1;    // c--;
    }
    
    public int value() {
        return c;
    }
}
