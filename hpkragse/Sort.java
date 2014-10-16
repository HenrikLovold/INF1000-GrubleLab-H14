import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 * Oblig 6 - INF1010 - vår 2014
 * @author hpkragse
 *
 */
public class Sort {
	
	static int threadCnt, wordCnt;
	static String inFile, outFile;
	static String[] words;
	
	public static void main(String[] args) {
		
		
		init(args);
		readFile();
		
		Sorter S = new Sorter(threadCnt, wordCnt,  inFile, outFile, words);
		
		words = S.sort();
		
		writeFile();
	}
	
	private static void init(String[] args) {
		try {
			outFile = args[2];
			inFile = args[1];
			if ((threadCnt = Integer.parseInt(args[0])) < 1) {
				throw new NumberFormatException();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nDu har ikke oppgitt nok argumenter, korrekt bruk:\nSort <antall tråder> <inFil> <utFil>\n");
			System.exit(-1);
		} catch (NumberFormatException e) {
			System.out.println("\nDu har oppgitt et antall tråder som ikke er gyldig.\nOppgi et heltall mellom 0 og " + Integer.MAX_VALUE + "\n");
			System.exit(-1);
		}
	}
	
	private static void readFile() {
		try {
			Scanner sc = new Scanner(new FileReader(inFile));
			wordCnt = Integer.parseInt(sc.nextLine().trim());
			
			words = new String[wordCnt];
			
			for (int i = 0; i < wordCnt; i++) {
				if (!sc.hasNext()) {
					System.out.println("\nFilen din inneholder færre ord enn det som er oppgitt på første linje.\n");
					System.exit(-1);
				}
				while ((words[i] = sc.nextLine().trim()) == "") {
					continue;
				}
			}
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("\nFørst linje i filen din inneholder ikke et tall mellom 0 og " + Integer.MAX_VALUE + "\n");
			System.exit(-1);
		} catch (NoSuchElementException e) {
			System.out.println("\nFilen er tom!\n");
			System.exit(-1);
		} catch (FileNotFoundException e) {
			System.out.println("\nFilnavnet du oppga er ugyldig!\n");
			System.exit(-1);
		}
	}
	
	private static void writeFile() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(outFile, false));
			pw.println(wordCnt);
			for (int i = 0; i < words.length; i++) {
				pw.println(words[i]);
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("\nNoe feilet da det skulle skrives til fil!\n");
			System.exit(-1);
		}
		//System.out.println("\nUtskrift er gjort til filen " + outFile + "\n");
	}
}
