package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**esempio lettura da file con dati in formato csv(comma separated value, no spazi, virgola come separatore),
 * FILE READER, BUFFERED READER
 * 
 * @author fedeg
 *
 */

public class LetturaFile {

	public static void main(String[] args) 
//		throws FileNotFoundException 
	{	
		// usi file reader, riceve come parametro il nome del file da leggere (in cartella package)
		// oppure il percorso assoluto
		Reader r; // Reader è la classe più generale
		
		try
		{
			r = new FileReader("input.txt");
			System.out.println("Lettura con FileReader:");
			
			int carattere;
			while ((carattere = r.read()) != -1) // metodo read restituisce un intero (la codifica)
			{
				System.out.print((char)carattere); // cast a char
			}
			r.close();
			
			// BUFFERED READER, legge da un file, bufferizza i caratteri letti
			System.out.println("\nLettura con BufferedReader:");
			
			r = new FileReader("input.txt"); // riapro il file
			BufferedReader br = new BufferedReader(r);
			String riga;
			while ((riga = br.readLine()) != null)
			{
				//System.out.println(riga);
				// Separare i vari elementi?
				
				String [] elementi = riga.split(",");
				
				System.out.println("Matricola: "+ elementi[0]);
				System.out.println("Nome: "+ elementi[1]);
				System.out.println("Cognome: "+ elementi[2]);
				
			}
			br.close();
			r.close(); // chiudere il file? qui non è importante
			// ma in generale si perchè altrimenti è bloccato in lettura
		}
		catch (IOException e) // se non sapessi il tipo puoi mettere Exception, IOException
		{
			System.err.println("Errore!" + e.getMessage()); // System.err per gli errori
//			e.printStackTrace();
		}
//		catch (IOException){}
		
	}

}
