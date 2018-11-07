package ripasso;

import nuovopackage.ClasseStatica;
import java.lang.Math;

import javax.swing.JOptionPane;

public class StaticApplicazione {

	public static void main(String[] args) {
		
		double i = nuovopackage.ClasseStatica.inverso(5.0);
		
		System.out.println(i);
		
		double d = 5.0 * 5.0 * 5.0;
		
		Math.pow(5.0, 3);
		
		String s = JOptionPane.showInputDialog("Inserisci un intero: ");
		
		//int l = s + 2;
		
		Integer h = new Integer(s);		// h = Integer.parseInt(s);
		
		System.out.println(h);
		
		int hh = h.intValue();
		
		Double d1 = new Double (1.0);
		Double d2 = new Double (3.0);
		
		double d3 = d1.doubleValue() + d2.doubleValue(); 
		
		// AUTOBOXING: operazioni direttamente sui tipi wrapper
		
		double d4 = d1 + d2;	
		
		Double d5 = d1 + d2; // costa circa 20-30 volte un'operazione elementare
		
		
	}

	/*public static double inverso(double n)
	{
		return 1/n;
	}
	
	*/
	
	
	
	
	
}
