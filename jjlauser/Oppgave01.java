public class Nettbank {
    private ArrayList<Konto> kunder = new ArrayList<Kunde>();
    private String navn;
    public NettBank(String n) {
	navn = n;
    }
    public NettBank() {
	navn = "Defaultbank";
    }
}

public class Kunde {
    private Konto[] konter = new Konto[5];
    private String navn;
    private String personNr;
    public Kunde(String n,String p) {
	navn = n;
	personNr = p;
    }

}

public class Konto {
    private AvtaleGiro[] giros = new AvtaleGiro[10];
    private String kontoNavn;
    private String kontoNr;
    private int saldo;
    public Konto(String kn,String knr, int s) {
	kontoNavn = kn;
	kontoNr = knr;
	saldo = s;
    }
}

public class AvtaleGiro {
    private Konto referanse;
    private String navn;
 
    public Konto(Konto k,String n) {
	referanse = k;
	navn = n;
    }
}
