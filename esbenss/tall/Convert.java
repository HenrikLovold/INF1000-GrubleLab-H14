public class Convert{

	public static void main(String[] args){

		int numberToConvert = 1;

		int dividend;
		int modulo;
		String binary = "";

		while(numberToConvert > 0){
			modulo = numberToConvert%2;

			numberToConvert = numberToConvert/2;

			binary = modulo + binary;
		}

		System.out.println(binary);

	}
}