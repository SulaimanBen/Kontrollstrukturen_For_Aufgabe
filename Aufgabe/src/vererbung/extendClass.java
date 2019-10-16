package vererbung;


class Fahrzeug{
	private String hersteller;
	private String modell;
	
	
	public Fahrzeug(String hersteller, String modell) {
		this.hersteller = hersteller;
		this.modell =modell;
	}

	String getModell(){
		return modell;
	}
	
	@Override
	public String toString() {
		return hersteller + " " + modell;
	}
}

class PKW extends Fahrzeug{
	public PKW(String hersteller, String modell) {
		super(hersteller , modell);
	}

	
	void automatischEinparken() {
		System.out.println("Parkassistent wird aktiviert...");
	}
	
}

class LKW extends Fahrzeug{
	private int last;
	
	public LKW(String hersteller, String modell) {
		super(hersteller , modell);
	}
	
	void beladen(int last) {
		this.last = last;
	}
}


public class extendClass {
	
	public static void main(String[] args) {
		PKW pkw = new PKW("BMW" , "i7");
		System.out.println(pkw);
		System.out.println("Modell von pkw : "+ pkw.getModell());
		pkw.automatischEinparken();
		
		LKW lkw = new LKW("Man" , "M1");
		System.out.println(lkw);
		System.out.println("Modell von lkw : "+ lkw.getModell());
		
		lkw.beladen(20);
		//PKW ver = new LKW("", "")
	}

}
