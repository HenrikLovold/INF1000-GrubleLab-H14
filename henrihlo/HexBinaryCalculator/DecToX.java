
public class DecToX {
	
	public static void main(String[] args){
		System.out.println("====" + decToHex(61453l) + " " + decToHex(6165959l) +  "====");
		System.out.println(decToHex(218545903l));
		System.out.println(decToHex(212332557l));
		System.out.println(decToHex(3674190335l));
		System.out.println(decToHex(230204440952559l));
		System.out.println(decToHex(195952359l));
		System.out.println();
		System.out.println(decToHex(3234512922l));
		System.out.println(decToHex(12648430l));
		System.out.println(decToHex(830624l));
	}
	
	public static String decToBin(long dec){
		String reverse = "";
		long quotient = dec;
		
		while(quotient != 0) {
			reverse = (quotient%2 == 0? "0" : "1") + reverse;
			quotient /= 2;
		}
		return reverse;
	}
	
	public static String decToHex(long dec) {
		String reverse = "";
		long quotient = dec;
		while(quotient != 0) {
			long letter = (quotient%16L);
			if(letter > 9){
				letter += 55;
			} else {
				letter += 48;
			}
			reverse = (char)letter + reverse;
			quotient /= 16;
		}
		return reverse;
	}
}
