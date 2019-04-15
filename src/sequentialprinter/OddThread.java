package sequentialprinter;

public class OddThread extends Thread {
	//add monitor here

	public OddThread(OddEvenMonitor monitor){
		//set monitor here
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 100 ; i+= 2) {
			System.out.println(i);
			try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
            }
		}
	}
}
