public class euler6{

	public static void main(String[] args){

		int number = 0;

		int resultSquare = 0;

		int resultAdd = 0;

		for (int i = 1; i < 101; i ++){

			resultSquare = resultSquare + (i*i);
			resultAdd = resultAdd + i;
		}

		int difference = (resultAdd*resultAdd) - resultSquare;

		System.out.println(difference);
	}
}