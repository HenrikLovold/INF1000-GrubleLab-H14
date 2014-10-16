import java.util.ArrayList;
import java.util.Collections;


public class QuickSort {
	
	public static ArrayList<String> quicksort(ArrayList<String> words, int level){		
		if(Math.pow(2, level) < 14000){
			String pivot = words.get(0);
			ArrayList<String> left = new ArrayList<String>();
			ArrayList<String> right = new ArrayList<String>();

			for(String s : words){
				if(s.compareTo(pivot) < 0) {
					left.add(s);
				} else {
					right.add(s);
				}
			}		
			left.add(pivot);
			
			quicksort(left, level+1);
			quicksort(right, level+1);
			
			words.clear();
			for(int i = 0; i < left.size(); i++){
				words.add(left.get(i));
			}
			for(int i = 0; i < right.size(); i++){
				words.add(right.get(i));
			}
			
			return words;
		} else {
			Collections.sort(words);
			return words;
		}
	}
}
