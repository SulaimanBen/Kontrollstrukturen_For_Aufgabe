package Aufgabe_19Sep;

public class AufgabeKontrollstrukturen {

	public static void main(String[] args) {
		
		System.out.println(summe(1,5));
		System.out.println(HochF(3,4));
		System.out.println(HochW(3,4));
		System.out.println(MathHoch(3,4));
		System.out.println("-------------------------------------------");
		zeichneRechteck1(5,4);
		System.out.println("-------------------------------------------");
		zeichneRechteck2(5,4);
		System.out.println("-------------------------------------------");
		zeichenRechteck3(6,6);
		System.out.println("-------------------------------------------");
		monaten(4);
		
	}
	
	// A 1: Summe von N1 bis N2
	
	static int summe(int Von, int Bis) {
		int sum=0;
		for(int i=Von; i <=Bis; i++)
			sum=sum+i;
		return sum;
	}
	
	// A 2 : X hoch Y ---> for-Schleife
	
	static int HochF(int x, int y) {
		int h=x;
		for(int i=1; i < y; i++) {
			h=h*x;
		}
		return h;
	}
	
	// A 3: X hoch Y -----> while-Schleife
	
	static int HochW(int x , int y) {
		int h=x;
		while(y>1) {
			h*=x;
			y--;
		}
		return h;	
	}
	
	// A 4: X hoch Y -----> Math Method
	
	static int MathHoch(int x, int y) {
		int hoch=(int)Math.pow(x,y);
		return hoch;
	}
	
	// A 5:
	
	static void zeichneRechteck1(int breite,int hoehe) {
		
		for(int h=1; h <= hoehe ; h++) {
			for(int b=1; b <= breite ; b++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	// A 6:
	
	static void zeichneRechteck2(int breite,int hoehe) {
		
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
	
	// A 7:
	
	static void zeichenRechteck3(int breite, int hoehe) {
		
		for(int h= 1; h<= hoehe; h++) {
			for(int b=1; b<= breite; b++) {
				if(h == 1 && b == 1) 
					System.out.print(" ");
				else if(h==1 && b !=1)
					System.out.print(b-1);
				else if(h == 2 && b == 1)
					System.out.print("A");
				else if((h==2 || h==3 || h==4 || h==5 || h==6) && b != 1)
				 System.out.print(".");
				else if(h == 3 && b==1)
					System.out.print("B");
				else if (h == 4 && b==1)
					System.out.print("C");
				else if(h == 5 && b==1)
					System.out.print("D");
				else if(h == 6 && b==1)
					System.out.print("E");
			}
			System.out.println();
		}
	}
	
	// A 8:
	
	static void monaten(int mon) {
		
		for(int monat=mon; monat <= 12 && monat>0; ) {
			
			switch(monat) {
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: for(int i=1 ; i<=31;i++) {
				System.out.print(i+" ");}
				break;
			case 2: for(int i= 1; i<=29;i++) 
				System.out.print(i+" ");
			break;
			default: for(int i=1;i<=30;i++) {
				System.out.print(i+" ");
			}break;
			}
			break;
			
		}
	}
}
