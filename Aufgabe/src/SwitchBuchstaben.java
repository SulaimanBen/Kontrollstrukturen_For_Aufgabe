import javax.swing.JOptionPane;
import java.lang.*;

public class SwitchBuchstaben {
	
	public static void main(String[] args) {
		
    
		Kchar();
		meth2();
		
	}
		
	 /*  
       * switch-Anweisung ->>> Konsonanten Oder Vokal ist?
       */
		
		static void Kchar() {
        String s= JOptionPane.showInputDialog("Buchstabe Eingeben");
        char ch=s.charAt(0);
        
        boolean b1=Character.isLowerCase(ch);
        if(b1) {
        switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("das ist ein Vokal");
			break;
		default:System.out.println("das ist ein Konsonat");
			break;
		}
        }
        else
        	System.out.println("ist keine kleine Buchstabe");
		}
		
        
        /*
         * switch-Anweisung ->>>> kleinBuchstabe
         */
        
		static void meth2() {
	        
	        for( char ch='ß';ch<='z'; ch++ )
	        	Kchar();
	        	
		}
		
}
