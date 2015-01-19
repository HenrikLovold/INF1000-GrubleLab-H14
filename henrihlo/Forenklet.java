public class Forenklet {
    public static void main(String[] args){
	
	int x = 2;
	int y = x > 10? 3 : -3;
	System.out.println("y: " + y);



	String s = "Hello";
	s = s.equals("Hello") ? (greet()) : (angry());

	

	String[] strings = {"a", "b", "c", "d"};

	for(String a : strings){
	    a = "heisann";
	    System.out.println(a);
	}

	for(String a : strings){
	    System.out.println(a);
	}

    }

    public static String greet(){
	System.out.println("Hello there");
	return "";
    }

    public static String angry(){
	System.out.println("You should always greet");
	return "";
    }
}