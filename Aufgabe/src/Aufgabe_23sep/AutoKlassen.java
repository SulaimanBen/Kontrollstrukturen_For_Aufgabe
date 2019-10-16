package Aufgabe_23sep;


public class AutoKlassen {
	
public static void main(String[] args) {
	
	Auto auto1=new Auto();
	auto1.modell="BMW";
	auto1.speed=360;
	Auto.printAuto(auto1);
	auto1.fahren();
	System.out.println(auto1);
}


}
class Auto{
	String modell;
	int speed;
	
	public static void printAuto(Auto auto) {
		System.out.println(auto.modell+"  "+auto.speed);
	}
	void fahren() {
		System.out.println(this.modell+"  "+this.speed);
	}
}
