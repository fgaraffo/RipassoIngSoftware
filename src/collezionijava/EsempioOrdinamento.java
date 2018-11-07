package collezionijava;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *  ARGOMENTI: 	1) Classi interna anonima
 *  			2) ordinamento --> Collections.sort
 * 				3) classi annidate
 * 				
 * 
 * @author fedeg
 *
 */

public class EsempioOrdinamento {

	public static void main(String[] args) {

		List <Studente> studenti = new LinkedList <Studente>();
		
		Studente s = new Studente ("Mario", "Rossi", "s123");
		
		studenti.add(s);
		studenti.add(new Studente("Giuseppe","Verdi","s124"));
		studenti.add(new Studente("Mario","Monti","s125"));
		studenti.add(new Studente("Alberto","Monti","s128"));
		
		System.out.println("Non ordinata: "+studenti);
		
		Collections.sort(studenti); // limite: unico criterio di ordinamento
		
		System.out.println("Ordinata per cognome: "+studenti);
	
		Comparator <Studente> cmp = new ComparatoreDiStudente();
		// Alternativa sposti la classe Comparatore dentro Studente
		// Comparator <Studente> cmp = new Studente.Comparatore();
		// nomeClasseContenitore.nomeClasseAnnidata
		
		// OPPURE visto che questa classe viene usata solo qui usi
		// CLASSE ANNIDATA, ANONIMA
				
/*		Comparator <Studente> cmp = new Comparator<Studente>()
		{
			public int compare (Studente s1, Studente s2)
			{
				return s1.getMatricola().compareTo(s2.getMatricola());
			}
		};

*		Vantaggio: la usi solo qui, ti permette di avere a vista il criterio nel momento in cui
*		effettui il confronto
*
*		+ COMPATTO:
*		Collections.sort(studenti, new Comparator<Studente>()
		{
			public int compare (Studente s1, Studente s2)
			{
				return s1.getMatricola().compareTo(s2.getMatricola());
			}
		};);
*
*/		
		
		Collections.sort(studenti, cmp);
	
		System.out.println("Ordinata per matricola: "+studenti);
	
	
	}

	
}
