package eccezioni;

public class EsNumber {

	/**Runtime Exception
	 * 
	 */
	
	public static void main(String[] args) {

		String s = " 123";
		int i;
	
		try 
		{
			i = Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			i = 0;
		}
		
		System.out.println(s + " + 1 = " + (i+1));
		
		String [] numeri = {"1","2","x","4"};
		
		int somma=0;
		// invece di fermarsi fa la somma fino a quando non viene generata l'ecc
		// termina al primo errore
		try 
		{
			for (int j=0;j<numeri.length;j++)
			{
				int v = Integer.parseInt(numeri[j]);
				somma+=v;
			}
		}
		catch (NumberFormatException e)
		{
			// 
		}
		
		System.out.println("Somma = " + somma);
		
		
		// OPPURE annidi il try dentro il ciclo: somma tutti i numeri e "salta" x
		// rileva l'errore e procede con le iterazioni successive

//		for (int j=0;j<numeri.length;j++)
//		{
//			try
//			{
//				int v = Integer.parseInt(numeri[j]);
//				somma+=v;
//			}	
//			catch (NumberFormatException e)
//			{
				// 
//			}	
//			
//		}

		
	}

}







