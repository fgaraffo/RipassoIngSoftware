package collezionijava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**Come cercare lo studente data la matricola?
 * 
 * @author fedeg
 *
 */

public class EsempioMap {

	public static void main(String[] args) {

		List <Studente> studenti = new LinkedList <Studente>();
		
		Studente s = new Studente ("Mario", "Rossi", "s123");
		
		studenti.add(s);
		studenti.add(new Studente("Giuseppe","Verdi","s124"));
		studenti.add(new Studente("Mario","Monti","s125"));
				
		String daCercare = "s124";
		
		for(Studente t : studenti) // molto oneroso
		{
			if (t.getMatricola().equals(daCercare))
				System.out.println("Trovato: "+t);
		}
		
		// Interfaccia Map
		Map <String, Studente> m = new TreeMap<String, Studente>(); //Map <key,value>
		
		m.put("s123", s);
		m.put("s167", new Studente("Prova","ZProva","s167"));
		
		Studente t = m.get("s123");
		System.out.println(t);
		
		// Ordinare una mappa? Non direttamente
		
		LinkedList <Studente> l = new LinkedList <Studente> (m.values());
		Collections.sort(l);
		
		System.out.println(l);
		
	}

}
