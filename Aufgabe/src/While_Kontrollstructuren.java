
public class While_Kontrollstructuren {
	
	public static void main(String[] args) {
		
		/*
		 *  for-Schleife => while Schleife
		 */
		
	 //Folgende Zahlenreihe mit der while-Schleife in einer Zeile ausgeben:0 1 2 3 4 5 6 7 8 9
		
	int i=0;
	while(i<10) {
		System.out.print(i+" ");
		i++;
	}
	System.out.println();
	
	//Folgende Zahlenreihe mit der while-Schleife in einer Zeile ausgeben: 0 2 3 4 5 6 7 8 9
	
	i=0;
	while(i<=9) {
		if(i == 1) {
			i++;
			continue;
		}
		else
			System.out.print(i+" ");
		i++;
	}
	System.out.println();
	
	//Folgende Zahlenreihe mit der while-Schleife in einer Zeile ausgeben:  -4 -2 0 2 4 ... 50
	 
	i=-4;
	while(i<=50) {
		System.out.print(i+" ");
		i+=2;
	}
		System.out.println();
		
		//Die Englischen Kleinbuchstaben von a bis z in einer Zeile ausgeben
		
		char ch='a';
		while(ch <= 'z') {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
		
		//Die Zahlen aus dem Bereich [1 ... 100] ausgeben, die durch 5 ohne Rest dividierbar sind
		
		i=1;
		while(i<=100) {
			if(i%5 != 0) {
				i++;
				continue;
			}
			else
				System.out.print(i+" ");
			i++;
		}
		
	}
}
