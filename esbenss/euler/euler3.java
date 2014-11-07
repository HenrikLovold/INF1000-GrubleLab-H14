import java.util.ArrayList;


public class euler3{

	public static void main(String[] args){

		long number = 600851475143l;
		ArrayList<Integer> primes = new ArrayList<>();

		int factor = 2;

		while (factor <= number){

			if (number % factor == 0){
				primes.add(factor);

				number = number / factor;
			}

			factor++;
		}

		System.out.println(primes.get(primes.size()-1));
		System.out.println(primes);	
	}
}