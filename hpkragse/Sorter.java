
public class Sorter {
	
	int threadCnt, wordCnt, wordsPerThread, remainder;
	String inFile, outFile;
	Thread[] threadPointers;
	SortThread[] threads;
	String[] words;
	Monitor monitor;
	
	Sorter(int threadCnt, int wordCnt, String inFile, String outFile, String[] words) {
		this.threadCnt = threadCnt;
		this.wordCnt = wordCnt;
		this.inFile = inFile;
		this.outFile = outFile;
		this.words = words;
		
		this.wordsPerThread = wordCnt / threadCnt;
		this.remainder = wordCnt % threadCnt;
		if (wordsPerThread == 0) {		//Hvis man oppgir flere tråder enn det er ord i filen
			this.wordsPerThread = 1;
			this.threadCnt = remainder;
		}
		monitor = new Monitor(wordCnt);
	}

	String[] sort() {

		System.out.println("Ord:\t\t" + wordCnt);
		System.out.println("Tråder:\t\t" + threadCnt);
		System.out.println("Ord per tråd:\t" + wordsPerThread);
		long time = System.currentTimeMillis();
		System.out.println();
		
		threads = new SortThread[threadCnt];
		threadPointers = new Thread[threadCnt];
		
		int startIndex = 0;
		
		for (int i = 0; i < threads.length; i++) {
			if (remainder > 0) {
				threads[i] = new SortThread(wordsPerThread + 1, startIndex, words, monitor);
				remainder--;
				threadPointers[i] = new Thread(threads[i]);
				threadPointers[i].start();
				startIndex += wordsPerThread + 1;
			} else {
				threads[i] = new SortThread(wordsPerThread, startIndex, words, monitor);
				threadPointers[i] = new Thread(threads[i]);
				threadPointers[i].start();
				startIndex += wordsPerThread;
			}
		}
		
		for (Thread T : threadPointers) {
			try {
				T.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (monitor.finished == false) {
			continue;
		}
		time = (System.currentTimeMillis() - time);
		
		System.out.println("Tid: " + time + "ms");
		
		words = monitor.getWords();
		return words;
	}
}
