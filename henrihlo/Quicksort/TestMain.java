import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class TestMain {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("sowpods.txt"));
		
		ArrayList<String> words = new ArrayList<String>();
		while(sc.hasNextLine()){
			words.add(sc.nextLine());
		}
		
		long start = System.currentTimeMillis();
		ArrayList<String> sorted = QuickSort.quicksort(words, 0);
		long diff = System.currentTimeMillis() - start;
		
		System.out.println("My sort: " + diff);
		
		sorted.clear();
		
		start = System.currentTimeMillis();
		sorted = Collections.sort(words);
		diff = System.currentTimeMillis() - start;
		
		
//		for(String s : sorted){
//			System.out.println(s);
//		}
		
	}

}
