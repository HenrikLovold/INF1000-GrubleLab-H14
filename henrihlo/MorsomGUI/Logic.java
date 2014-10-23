import java.util.Random;

class Logic {

	int generateLoveScore(String navn1, String navn2){
		int result = 0;

		Random r = new Random(navn1.charAt(0));

		result = r.nextInt();

		r = new Random(navn2.charAt(0));

		result += r.nextInt();

		result = result % 101;

		return result;
	}
}