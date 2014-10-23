
public class Monitor {
	
	private volatile boolean waiting = false;
	private volatile String[] words;
	private int wordCnt;
	public volatile boolean finished;
	
	Monitor(int wordCnt) {
		this.wordCnt = wordCnt;
	}

	synchronized public void braid(String[] wordsIn) {
		if (wordsIn.length == wordCnt) {		//Sjekk for lengde på array
			this.words = wordsIn;
			if (wordsIn[wordCnt - 1] == null) {
				System.out.println("\nSiste element var null!\n");
				System.exit(-1);
			}
			finished = true;
			return;
		}
		if (waiting) {
			MergeThread mt = new MergeThread(this.words, wordsIn, this);
			new Thread(mt).start();
			waiting = false;
		} else {
			this.words = wordsIn;
			waiting = true;
		}
	}
	
	String[] getWords() {
		return words;
	}
}
