package OppgaverUke35;
import java.lang.*;
import static javax.swing.JOptionPane.*;

public class oppgave6 {

	public static void main (String[] args) {
		
		String fra = showInputDialog("Skriv inn bruttointekt:");
		int a = Integer.parseInt(fra);
		
		if (a <= 164100) {
			showMessageDialog(null, a*0 + " kr i skatt:");
		}
			
		if (a >= 164100 && a <= 230950) {
			showMessageDialog(null, "trinn1: " + a*0.93/100 + " kr i skatt");
		}
		
		if (a >= 230950 && a <= 580650) {
			showMessageDialog(null, "trinn2: " + a*2.41/100 + " kr i skatt");
		}
		
		if (a >= 580650 && a <= 934050) {
			showMessageDialog(null,"trinn3: " + a*11.52/100 + " kr i skatt");
		}
		
		if (a >= 934050) {
			showMessageDialog(null,"trinn4: " + a*14.52/100 + " kr i skatt");
		}
	}
}