public class convertion{

	public static void main(String[] args){

		int numberToConvert = Integer.parseInt(args [0]);

		int columnValue = 1;

		String binary = "";

		while (numberToConvert/2 >= columnValue){

			columnValue = columnValue * 2;
		}


		for(int i = (columnValue); i > 0; i = (i/2)){
			
			binary = binary + 1;

			numberToConvert = (numberToConvert%i);

			if (i == 1){
				break;
			}

			if (numberToConvert == 0){

				while (i > 1){
				
					binary = binary + 0;

					i = (i /2);
				}

			}
			 
		}

		System.out.println(binary);

	}
}