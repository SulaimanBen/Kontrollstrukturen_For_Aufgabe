import javax.swing.JOptionPane;

public class SwitchBuchstaben {
	
	public static void main(String[] args) {
		
      /*  
       * switch-Anweisung ->>> Konsonanten Oder Vokal ist?
        */
        String s= JOptionPane.showInputDialog("Buchstabe Eingeben");
        char ch=s.charAt(0);
        
        switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("das ist ein Vokal")
			;break;

		default:System.out.println("das ist ein Konsonat");
			break;
		}
        
        
        /*
         * switch-Anweisung ->>>> kleinBuchstabe
         */
        
      /*  String st=JOptionPane.showInputDialog("Buchstabe Eingeben");
        char b=s.charAt(0);
        
        switch (b) {
		case character.isLowercase(b):
			
			break;

		default:
			break;
		}*/
        
		
	}
}
