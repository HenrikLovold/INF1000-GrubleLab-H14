
public class MergeThread implements Runnable {
	
	String[] words1, words2, words3;
	Monitor monitor;
	
	MergeThread(String[] words1in, String[] words2in, Monitor monitor) {
		this.words1 = new String[words1in.length];
		for (int i = 0; i < words1.length; i++) {
			this.words1[i] = words1in[i];
		}
		
		this.words2 = new String[words2in.length];
		for (int i = 0; i < words2.length; i++) {
			this.words2[i] = words2in[i];
		}
		
		words3 = new String[words1.length + words2.length];
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
		int counter = 0;
		int counter2 = 0;
		int i = 0;
		while (i < words1.length) {
			if (counter2 == words2.length) {
				words3[counter] = words1[i];
				i++;
				counter++;
			} else if (words1[i].compareTo(words2[counter2]) < 0) {
				words3[counter] = words1[i];
				counter++;
				i++;
			} else {
				words3[counter] = words2[counter2];
				counter++;
				counter2++;
			}
		}
		for (; counter2 < words2.length; counter2++) {
			words3[counter] = words2[counter2];
			counter++;

		}
		monitor.braid(words3);
	}
}
