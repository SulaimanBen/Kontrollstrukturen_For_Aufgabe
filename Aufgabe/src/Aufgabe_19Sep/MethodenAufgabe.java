package Aufgabe_19Sep;

public class MethodenAufgabe {
	
	public static void main(String[] args) {
			
		PrintFromTo(0,10);
		System.out.println("\n----------------------------------------");
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
		return s;
	}
	
	// Aufgabe 3:
	
	static int sumFromTo(int from,int to) {
		int s=from;
		for(int value=from+1; value <= to;value++ )
			s=s+value;
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
		
		for (int h = 0; h < hoehe; h++) {
			for (int b = 0; b < breite; b++) {
				if(fuellen || h == 0 || h == hoehe-1 || b == 0 || b == breite-1) 
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}
		
	}
	
	// Aufgabe 6 : (Math.random() * ((max - min) + 1)) + min
	
	static void printRandom(int N, int VON, int BIS) {
		
		java.util.Random random= new java.util.Random();		
		  
		for(int i=N; i> 0;i--) {
		int zahl=random.nextInt((BIS-VON)+1)+VON;
		//int randNum=(int)(Math.random() * ((BIS - VON) + 1)) + VON;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		//System.out.println(randNum);
		System.out.print(zahl+"  ");
		}
	}
}
