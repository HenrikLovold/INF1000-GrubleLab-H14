import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Sort{
	
	static File file;
	static ArrayList<String> wordList;
	

	public static void main(String[] args){


		String fileName = "Sowpods.txt";

		wordList = new ArrayList<>();
		// call method to read file
		readFile(fileName);

		// for (String s : wordList){
		// 	System.out.print(s + " | ");
		// }

		bubbleSort(wordList);

		for (String s : wordList){
			System.out.print(s + " | ");
		}
	}

	/**
	 * Method to read text from file
	 * @param fileName: name of file to read
	 */
	public static void readFile(String fileName) {
		// Create new file from filename. Create Scanner.
		file = new File(fileName);
		
		try{
			// create scanner for file
			Scanner scanner = new Scanner(file);

			// Keep reading file as long as there is a next line.
			while (scanner.hasNextLine()){
				wordList.add(scanner.nextLine());
			}
			// when file has no next line, return.
			return;

		} catch(FileNotFoundException e){
			System.out.println("Error: File " + fileName + " does not exist!");
			System.exit(1);
		}
	}

	private static void bubbleSort(ArrayList<String> wordList) {
		int n = wordList.size();
        String temp = null;
       
        for(int i=0; i < n; i++){

            for(int j=1; j < (n-i); j++){
                   
                if(wordList.get(j-1).compareTo(wordList.get(j)) > 0){
                        //swap the elements
                        temp = wordList.get(j-1);

                        wordList.set((j-1),wordList.get(j));
                        wordList.set(j,temp);
                }
                   
            }
        }	    
	}
}