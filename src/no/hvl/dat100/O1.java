package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O1 
{
	public static void main(String[] args) 
	{
	
		int antallStudenter = Integer.parseInt(showInputDialog("Skriv inn antall studenter: "));
		
		
		for (int i = 1; i <= antallStudenter; i++)
		{
		int poengsum = Integer.parseInt(showInputDialog("Gi en poengsum: "));	
	
		if (poengsum <= 100 && poengsum >= 90) 
			System.out.println("Karakter: A");
		else if (poengsum <= 89 && poengsum >= 80)
			System.out.println("Karakter: B");
		else if (poengsum <= 79 && poengsum >= 60)
			System.out.println("Karakter: C");
	    else if (poengsum <= 59 && poengsum >= 50)
	    	System.out.println("Karakter: D");
	    else if (poengsum <= 49 && poengsum >= 40)
	    	System.out.println("Karakter: E");
	    else if (poengsum <= 39 && poengsum >= 0)
	    	System.out.println("Karakter: F");
	    else 
	    {
	    	i = i - 1;
	    	showMessageDialog(null,"Du har ikke tastet riktig poengsum!");
		}
		}
	}
}
