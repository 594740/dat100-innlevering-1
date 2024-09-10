package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 
{
	public static void main(String[] args)
	{
		int tall = Integer.parseInt(showInputDialog("Tast inn tall det skal beregnes fakultet av: "));
		int fakultet = 1;
		
		if (tall > 0)
		{
			for (int n = 1; n <= tall; n++)
			fakultet = n*fakultet;	
			
			showMessageDialog(null, tall + "! = " + fakultet);
		}
		
		else
		{
			showMessageDialog(null, "Tast heltall større enn null!");
		}		
		
	}

}
