/**
* @ret
*/
public class HexaConvert{

	public static void main(String[] args){

		int numberToConvert = 218545903;

		int dividend;
		int modulo;
		String hexa = "";

		while(numberToConvert > 0){
			modulo = numberToConvert%16;

			numberToConvert = numberToConvert/16;

			if(modulo > 9){
				modulo = modulo + 55;
				char hex = (char)modulo;

				hexa = hex + hexa;
			} else {
				hexa = modulo + hexa;
			}
		}

		System.out.println(hexa);

	}
}