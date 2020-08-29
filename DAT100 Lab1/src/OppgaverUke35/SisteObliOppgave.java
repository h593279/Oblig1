package OppgaverUke35;
import java.lang.*;
import static javax.swing.JOptionPane.*;

public class SisteObliOppgave {
	public static void main (String[] args) {
		
		String fak = ("Skriv inn et heltall");
		int n = Integer.parseInt(showInputDialog(fak));
		
			
			int num = n;
	        int fakultet = 1;
	       
	        while(n > 0) {
	            
	        	fakultet *= n;
	            n--;

	        }
	        showMessageDialog(null, num + "! =" + fakultet);
	        
	    }
	}
