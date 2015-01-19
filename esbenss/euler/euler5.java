public class euler5{

	public static void main(String[] args){

		long tall = 2*3*5*11*13*17*19;
		long increase = tall;
		int result = 0;


				for (int i = 20; i > 0; i--){

					if(tall%i != 0){
						tall = tall + increase;
						i = 20;
					}
					
				}
		
		System.out.println(tall);
	}
}