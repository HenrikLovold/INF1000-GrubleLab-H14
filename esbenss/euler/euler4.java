import java.util.ArrayList;
import java.util.Collections;

public class euler4{

	public static void main(String[] args){

		int number = 999;
		int highest = 0;

		ArrayList<Integer> palindrome = new ArrayList<>();

		for (; number > 0; number--){

			for (int i = number; i > 0; i--){

				int product = number * i;
				String strNumber = "" + product;

				if(product < 100000){
					break;
				}

				String first3 = strNumber.substring(0,3);
				String last3 = strNumber.substring(3);
				String back3 = "";

				for(int j = 0; j < 3; j++){
					back3 = last3.charAt(j) + back3;
				}

				if (back3.equals(first3)){
					palindrome.add(product);
				}
			}
		}
		System.out.println(Collections.max(palindrome));
	}
}