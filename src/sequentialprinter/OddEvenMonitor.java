package sequentialprinter;

public	class OddEvenMonitor{
	public static final int ODD_TURN = -1;
	public static final int EVEN_TURN = 1;
	
	private int turn = ODD_TURN;
	
	public void waitTurn(int myTurn){
	}
	
	public void yieldTurn() {
		//if currently it is odd's turn then it will be even's turn
		//if currently it is even's turn then it will be odd's turn
		turn *= -1; 
	}
}

