
public class do_While_Kontrollstructuren {

	public static void main(String[] args) {
		
		/*
		 *  for-Schleife => do-while Schleife
		 */
		
		//Folgende Zahlenreihe mit der while-Schleife in einer Zeile ausgeben:0 1 2 3 4 5 6 7 8 9
		
		int i=0;
		do {
			System.out.print(i+" ");
			i++;
		} while (i<=9);
		
		System.out.println();
		
		//Folgende Zahlenreihe mit der while-Schleife in einer Zeile ausgeben: 0 2 3 4 5 6 7 8 9
		
		i=0;
		do {
			if (i == 1) {
				i++;
				continue;
			}
			System.out.print(i+" ");
			i++;
		} while (i<10);
		
		System.out.println();
		
		/*
		 * Zufälligen Wert :
		 */
		
		//(Math.random() * ((max - min) + 1)) + min
		
		double r;
		
		for(double x=100;x>0;x=x-(r=Math.random()*(5-1)+1)) {
			System.out.print(x+" ");
			
		}
	}
}
