package sequentialprinter;

public class EvenThread extends Thread {
	//add monitor here
	
	public EvenThread(OddEvenMonitor monitor){
		//set monitor here
	}
	
	@Override
	public void run() {
		for(int i = 2 ; i <= 100 ; i+=2) {
			System.out.println(i);
			try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
            }
		}
	}
}
