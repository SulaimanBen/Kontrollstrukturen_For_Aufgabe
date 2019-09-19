package SwitchIfAmpelfarben;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ampelfarben {
	
	public static void main(String[] args) {
		
		//switch-Anweisung um die Ampelfarbenzu analysieren.
		
		String farbe= JOptionPane.showInputDialog("Farbe Eingeben:");
		
		switch(farbe) {
		
		case "Grün": System.out.println("Weg frei");break;
		case "Gelb": System.out.println("Gleich get es los");break;
		case "Rot":  System.out.println("Bitte warten");break;
		default: System.out.println("Fehler! Diese Farbe gibt es nicht.");break;
		}
		
		// if / else if / else
		
		String farbe2= JOptionPane.showInputDialog("Farbe 2 Eingeben:");
		
		if(farbe2.contentEquals("Rot")) 
			System.out.println("Bitte warten");
		else if(farbe2.contentEquals("Grün")) 
			System.out.println("Weg frei");
		else if(farbe2.contentEquals("Gelb")) 
			System.out.println("Gleich get es los");
		else 
			System.out.println("Fehler! Diese Farbe gibt es nicht.");
		 
	}

}
