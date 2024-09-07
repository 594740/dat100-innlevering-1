package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.*;

public class O2 
{	
	public static void main(String[] args) 
	{
		double lønn = parseDouble(showInputDialog("Skriv din bruttolønn: "));
		double skatt = 0;
		
		if (lønn <= 208050)
			skatt = 0;
		else if (lønn >= 208051 && lønn <= 292850)
			skatt = 0.017*lønn + 0.5;
		else if (lønn >= 292851 && lønn <= 670000)
			skatt = 0.04*lønn + 0.5;
		else if (lønn >= 670001 && lønn <= 937900)
			skatt = 0.13*lønn + 0.5;
		else if (lønn >= 937901 && lønn <= 1350000)
			skatt = 0.166*lønn + 0.5;
		else if (lønn >= 1350001)
			skatt = 0.176*lønn + 0.5;
		
		int trinnskatt = (int)skatt;
		
				
		System.out.println("Du betaler " + trinnskatt + "kr i trinnskatt");
		
	}

}
