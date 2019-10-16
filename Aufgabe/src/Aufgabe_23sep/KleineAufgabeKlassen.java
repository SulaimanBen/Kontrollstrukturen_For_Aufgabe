package Aufgabe_23sep;

public class KleineAufgabeKlassen {
	
	public static void main(String[] args) {
		Buch b1=new Buch();
		PrintBuchAnzahl(b1,"Java ist auch eine Insel",600);
		b1.BuchTitel="Java";
		b1.AnzahlZeiten=600;
		a1();
		
	}
	
	static void BuchseitenAnzahl(Buch buchanzahl,int seitenAnzahl) {
		buchanzahl=new Buch();
		buchanzahl.AnzahlZeiten=seitenAnzahl;
		
	}
	
	static void PrintBuchAnzahl(Buch b , String BuchName, int seitenAnzahl) {
		b=new Buch();
		
		System.out.println(b.BuchTitel + "hat"+b.AnzahlZeiten +"seiten");
		
	}
	
	static void a1() {
		Buch b1=new Buch();
		System.out.println(b1.BuchTitel +" hat: "+b1.AnzahlZeiten);
	}
	
}

class Buch {
	String BuchTitel;
	int AnzahlZeiten;
}
