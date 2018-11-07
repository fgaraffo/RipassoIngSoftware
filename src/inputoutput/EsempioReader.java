package inputoutput;

//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;

import java.io.*;

import javax.swing.JOptionPane;

public class EsempioReader {

	public static void main(String[] args) 
		throws IOException
	{
		System.err.println("Lettura car. per car.");
		Reader r = new FileReader("input.txt");
		
		int carattere;
		int conta=0;
		while ((carattere=r.read()) != -1)
		{
			System.out.print((char)carattere);
			conta++; // questo conteggio potrebbe cambiare a seconda della macchina
		}
		// ci sono dei caratteri invisibili/speciali: ad esempio a capo su win è 2 caratteri
		// (carriage return + line feed) mentre mac/unix è 1 carattere solo
		System.out.println("\nCaratteri letti: "+conta);
		r.close();
		
		System.err.println("Lettura a blocchi");
		
		
		String f;
		Reader br = null;
		while (true)
		{
			try
			{
				// Flusso nominale, esecuzione normale
				f = JOptionPane.showInputDialog("Nome del file: ");
				br = new FileReader(f);
				break;
				//System.out.println("ISTRUZIONE SUCCESSIVA"); // non viene eseguita se si verifica eccezione
			}
			catch (FileNotFoundException e)
			{
				// Gestione eccezione
				JOptionPane.showMessageDialog(null, "Errore apertura file!");
			}
		}
		
		char [] blocco = new char [16]; // il blocco deve avere dimensione limitata (512/1024/4096)
		int n;
			
/*		n = br.read(blocco);
				
		//System.out.println(blocco);
		
		String s = new String (blocco,0,n); // + efficiente
		
		System.out.println(s);
		
		System.out.println("Caratteri letti: "+n);
*/
		conta =0;
		while ((n = br.read(blocco)) != -1)
		{
			String s = new String(blocco,0,n);
			System.out.print(s);
			conta+=n;
		}
		System.out.println("\nCaratteri letti: "+conta);
		br.close();
	}

}
