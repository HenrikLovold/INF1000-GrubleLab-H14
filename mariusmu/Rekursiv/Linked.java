class PersonList {

	PersonList neste;
	String navn;
	
	public void insert(String name) {
		if(neste == null) {
			neste = new PersonList();
			neste.setNavn(name);
		} else {
			neste.insert(name);
			}
	}
	
	public void setNavn(String name) {
		navn = name;
	}
	
	public String allNames() {
	String output = "";
	 if(neste != null) {
		output = neste.allNames();
		}
		if(navn != null) {
		output += " " + navn;
		}
		
		return output;
}
}

class Linked {

	public static void main(String[] args) {
	
	PersonList list = new PersonList();
	list.insert("Geir");
	list.insert("Lise");
	list.insert("Ali");
	System.out.println(list.allNames());
	} 
	
}