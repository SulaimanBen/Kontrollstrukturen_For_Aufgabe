
public class FakultätMethoden {
	
	public static void main(String[] args) {
		
		testgetFakultaetRekursiv(0,1);
		testgetFakultaetRekursiv(1,1);
		testgetFakultaetRekursiv(3,6);
		testgetFakultaetRekursiv(5,120);
		testgetFakultaetRekursiv(0,0);
		System.out.println(getFakultaet(3));
	}
	
	static int getFakultaetRekursiv(int f) {
		
		if (f <= 1) 
            return 1;
         else 
            return getFakultaetRekursiv(f - 1) * f;
		
	}
	
	static int getFakultaet(int f) {
		int fak = 1;
	    for(int i = 1; i <= f; i++) {
	        fak *= i;
	    }
	    return fak;
	}
	
	static void testgetFakultaetRekursiv(int f, int expected) {
		int actual= getFakultaetRekursiv(f);
		
		if(actual == expected)
			System.out.println("Test bestand für f= "+f);
		else
			System.out.println("Fehler ! Test Nicht bestand für f = "+ f+". Erwartet :"+ expected + ",Actual : "+ actual);
	}
	
}
