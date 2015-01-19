import java.util.ArrayList;

public class euler7{

	public static void main(String[] args){

		ArrayList<Integer> primeNumbers = new ArrayList<>();
		
		primeNumbers.add(2);		

		int currentSize = 1;

		for (int number = 3; number > 0; number ++){			
			
			boolean newPrime = true;
			
			for (int index = 0; index < currentSize && newPrime; index ++){
				
				newPrime = number % primeNumbers.get(index) != 0;
				
				if (!newPrime){
					break;
				}
			}
			
			if (newPrime) {
				primeNumbers.add(number);
				currentSize ++;
			}

			if (currentSize == 10001){
				System.out.println(primeNumbers.get(primeNumbers.size()-1));
				break;
			}



		}
	}
}