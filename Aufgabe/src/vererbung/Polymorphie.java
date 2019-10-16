package vererbung;

public class Polymorphie {
	
	static class Figur{
		int x ,y;

		public int getFlaeche() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	static class Rechteck extends Figur{
		int breite = 2 , hoehe = 3;
		
		public int getFlaeche() {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		Figur f = new Rechteck();
		System.out.println(f.getFlaeche());
		
	}
}