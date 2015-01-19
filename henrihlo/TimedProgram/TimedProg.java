import java.util.Arrays;

public class TimedProg{
	public static void main(String[] args){
		
		
		int[] a = {1, 2, 6, 34, 2, 45, 2, 1, 54, 3, 2, 4};
		
		
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long time = System.currentTimeMillis() - start;
		
		
		System.out.println("Sorterte på " + time + "ms");
	}
}
		