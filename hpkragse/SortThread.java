
public class SortThread implements Runnable{
	
	int wordsToSort, startIndex, remainder;
	String[] words;
	SortThread[] threads;
	Monitor monitor;
	
	SortThread(int wordsToSort, int startIndex, String[] words, Monitor monitor) {
		this.wordsToSort = wordsToSort;
		this.startIndex = startIndex;
		this.words = words;
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
		String[] wordsSorted = new String[wordsToSort];
		
		for (int i = startIndex; i < startIndex + wordsToSort; i++) {
			for (int j = startIndex; j <= i; j++) {
				if (words[i].compareTo(words[j]) < 0) {
					String in = words[i];
					for (int k = 0; k <= (i-j); k++) {
						String temp = words[j+k];
						words[j+k] = in;
						in = temp;
					}
				}
			}
		}
		for (int i = 0; i < wordsToSort; i++) {
			wordsSorted[i] = words[startIndex + i];
		}
		monitor.braid(wordsSorted);
	}
}
