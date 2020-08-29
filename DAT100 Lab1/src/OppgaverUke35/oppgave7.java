package OppgaverUke35;
import java.lang.*;
import static javax.swing.JOptionPane.*;


public class oppgave7 {
	public static void main (String[] args) {
		
		int ANT_STUD = 10;
		for(int i = 1; i <= ANT_STUD; i++) {
		String fra = ("Skriv inn poeng:");
		int a = Integer.parseInt(showInputDialog(fra));
		
	if(a > -1 && a < 101) {
		if (a <= 100 && a >= 90) {
			showMessageDialog(null, "Med " + a + " poeng, har du har fått karakteren A");
		}
			
		if (a <= 89 && a >= 80) {
			showMessageDialog(null, "Med " + a + " poeng, har du har fått karakteren B");
		}
		
		if (a <= 79 && a >= 60) {
			showMessageDialog(null, "Med " + a + " poeng, har du har fått karakteren C");
		}
		
		if (a <= 59 && a >= 50) {
			showMessageDialog(null,"Med " + a + " poeng, har du har fått karakteren D");
		}
		
		if (a <= 49 && a >= 40) {
			showMessageDialog(null,"Med " + a + " poeng, har du har fått karakteren E");
		}
		if (a <= 39 && a >= 0) {
			showMessageDialog(null,"Med " + a + " poeng, har du har fått karakteren F");
		}
		
	}else {
		while (a <= 0 && a > 100) {
			i++;
			a = Integer.parseInt(showInputDialog(fra));
		}
			showMessageDialog(null, a + " er ugyldig poeng. Skriv inn på nytt");
	}
}
	}
	}
	