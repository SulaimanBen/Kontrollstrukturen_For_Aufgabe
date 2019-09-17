
public class Kontrollstrukturen_For {

	public static void main(String[] args) {
		
		method1();
		method2();
		GeradeZahlen();
		Englischen_Kleinbuchstaben();
		Englischen_Grossbuchstaben();
		Rest();
		
	}

	
	  //Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben:0 1 2 3 4 5 6 7 8 9

	static void method1() {
		
		for(int num=0;num<10;num++)
			System.out.print(num+" ");
		System.out.print("\n");
	}
	
	  //Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben: 0 2 3 4 5 6 7 8 9
	
	static void method2() {
		
		for(int num=0;num<10;num++) 
			if(num != 1)
				System.out.print(num+" ");
			System.out.print("\n");
		
	}
	
	  //Folgende Zahlenreihe mit der for-Schleife in einer Zeile ausgeben:  -4 -2 0 2 4 ... 50
	
	static void GeradeZahlen() {
		
		for(int num=-4;num<=50;num+=2)
			System.out.print(num+" ");
		System.out.print("\n");
	}
	
	 //Die Englischen Kleinbuchstaben von a bis z in einer Zeile ausgeben:
	
	static void Englischen_Kleinbuchstaben() {
		
		String buchstaben="abcdefghijklmnopqrstuvwxyz";
		for(int x=0;x<buchstaben.length();x++)
			System.out.print(buchstaben.charAt(x)+" ");
		System.out.print("\n");
			
	}
	
	  //Die englischen Grossbuchstaben rueckwaerts in einer Zeile ausgeben:
	
	static void Englischen_Grossbuchstaben() {
		
		String Buchstaben="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int x=Buchstaben.length()-1;x>=0;x--)
			System.out.print(Buchstaben.charAt(x)+" ");
		System.out.print("\n");
	}
	
	  //Die Zahlen aus dem Bereich [1 ... 100] ausgeben, die durch 5 ohne Rest dividierbar sind
	
	static void Rest() {
		for(int x=1; x<=100 ;x++) 
			if(x%5 == 0)
			System.out.print(x+" ");
	}
	
	  //Folgende Zahlenreihe bitte in einer Zeile ausgeben: 3 1 2 3 2 1 2 1 1
	
	/*static void method3() {
		
		for(int x=9; x>0 ; x--) {
			for(int y=3; y>0 ;y--)
				System.out.print();
				
		}
		
	}*/

}
