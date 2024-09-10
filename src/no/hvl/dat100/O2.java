package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.*;

public class O2
{	
	public static void main(String[] args) 
	{
		int trinn1 = 208050;
		int trinn2 = 292850;
		int trinn3 = 670000;
		int trinn4 = 937900;
		int trinn5 = 1350000;
		double s1 = 0.017;            
		double s2 = 0.04;
		double s3 = 0.136;
		double s4 = 0.166;
		double s5 = 0.176;
		
		
		double lønn = parseDouble(showInputDialog("Skriv din bruttolønn: "));
		double skatt = 0;
		
		if (lønn <= 208050)
			skatt = 0;
		else if (trinn1 < lønn && lønn <= trinn2)
			skatt = (lønn-trinn1)*s1 + 0.5;
		else if (trinn2 < lønn && lønn <= trinn3)
			skatt = (trinn2 - trinn1)*s1 + (lønn - trinn2)*s2 + 0.5;
		else if (trinn3 < lønn && lønn <= trinn4)
			skatt = (trinn2 - trinn1)*s1 + (trinn3 - trinn2)*s2 + (lønn-trinn3)*s3 + 0.5;
		else if (trinn4 < lønn && lønn <= trinn5)
			skatt = (trinn2 - trinn1)*s1 + (trinn3 - trinn2)*s2 + (trinn4-trinn3)*s3 + (lønn-trinn4)*s4 + 0.5;
		else if (lønn >= trinn5)
			skatt = (trinn2 - trinn1)*s1 + (trinn3 - trinn2)*s2 + (trinn4-trinn3)*s3 + (trinn5-trinn4)*s4 + (lønn-trinn5)*s5 + 0.5;
		
		int trinnskatt = (int)skatt;
		
				
		System.out.println("Du betaler " + trinnskatt + "kr i trinnskatt");
		
	}

}
