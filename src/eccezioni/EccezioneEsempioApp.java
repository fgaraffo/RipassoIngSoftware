package eccezioni;

import java.util.LinkedList;
import java.util.List;

import collezionijava.*;

/**
 *  throws + try..catch
 *
 *  @author fedeg
 *
 */
public class EccezioneEsempioApp {

	public static void main(String[] args) //throws ErrStudenteInesistente {
	{
		Ateneo at = new Ateneo();
		
		at.add(new Studente("A.","Rossi","s120"));
		at.add(new Studente("B.","Verdi","s121"));
		at.add(new Studente("C.","Neri","s122"));
		at.add(new Studente("D.","Monti","s123"));
		at.add(new Studente("E.","Giallo","s124"));
		
//		at.getStudente("");		
//		Studente s = new Studente ("F.","Bianchi","s125");
		
		System.out.println(at.studenti.values());
		
		Ateneo a1 = new Ateneo();
		a1.add(new Studente("aa","bb","cc"));
		
		// 
		
		try 
		{	// flusso nominale di esecuzione
			Studente s1 = a1.getStudente("XX");
			
			System.out.println("Questo non viene fatto se prima hai eccezione");
			
		}
		catch (ErrStudenteInesistente e)
		{
			// casi eccezionali			
			System.out.println("Errore!![try..catch]"+"\n"+e.getMessage());
		}
		
	}

}
