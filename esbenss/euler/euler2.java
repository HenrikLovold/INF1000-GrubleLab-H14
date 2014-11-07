public class euler2{

	public static void main(String[] args){

		int previous = 1;
		int fib = 2;
		long sum = 0;

		while (fib < 4000001){

			if (fib%2 == 0){
				sum = sum + fib;
			}

			int temp = fib;

			fib = fib + previous;
			previous = temp;
		}

		System.out.println(sum);
	}
}