package Aufgabe_19Sep;

public class MethodenAufgabe {
	
	public static void main(String[] args) {
			
		PrintFromTo(0,10);
		System.out.println("---------------------------------------");
		System.out.println(sum(5,10));
		System.out.println("---------------------------------------");
		System.out.println(sumFromTo(0,3));
		System.out.println("---------------------------------------");
		zeichneRechteck(5,4);
		System.out.println("---------------------------------------");
		zeichneRechteck(5,4,true);
		System.out.println("---------------------------------------");
		zeichneRechteck(5,4,false);
		System.out.println("---------------------------------------");
		printRandom(5,10,20);
		
		
	}
	
	// Aufgabe 1:
	
	static void PrintFromTo(int from,int to) {
		for(int i=from; i <= to; i++)
			System.out.print(i+" ");
	}
	
	// Aufgabe 2:
	
	static int sum(int x,int y) {
		int s=x+y;
		System.out.println();
		return s;
	}
	
	// Aufgabe 3:
	
	static int sumFromTo(int from,int to) {
		int s=from;
		for(int i=from+1; i <= to;i++ )
			s=s+i;
		return s;	
	}
	
	// Aufgabe 4:
	
	static void zeichneRechteck(int breite,int hoehe) {
		
		for(int h=1; h <= hoehe ; h++) {
			for(int b=1; b <= breite ; b++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	// Aufgabe 5:
	
	static void zeichneRechteck(int breite,int hoehe, boolean fuellen) {
		
		if(fuellen == true) {
			for(int h=1; h <= hoehe ; h++) {
				for(int b=1; b <= breite ; b++)
					System.out.print("*");
				System.out.println();
			}
		}
		else {
			for(int h=1; h <= hoehe ; h++) {
				for(int b=1; b <= breite ; b++) {
					if(h == 2 && (b==2 || b==3|| b==4)|| h == 3 && (b==2 || b==3|| b==4) ) 
						System.out.print(" ");
						
					else 
						System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
	
	// Aufgabe 6 : (Math.random() * ((max - min) + 1)) + min
	
	static void printRandom(int N, int VON, int BIS) {
		for(int i=N; i> 0;i--) {
		int randNum=(int)(Math.random() * ((BIS - VON) + 1)) + VON;
		System.out.println(randNum);
		}
	}
}
