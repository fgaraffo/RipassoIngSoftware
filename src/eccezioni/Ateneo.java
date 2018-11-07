package eccezioni;

import java.util.HashMap;
import java.util.Map;

import collezionijava.*;

public class Ateneo {

	Map<String,Studente> studenti = new HashMap<String,Studente>();
	
	public void add (Studente s)
	{
		studenti.put(s.getMatricola(), s);
	}
	
	public Studente getStudente (String matricola) throws ErrStudenteInesistente
	{
		if ( ! studenti.containsKey(matricola))
		{
			// genero eccezione
			ErrStudenteInesistente ecc = new ErrStudenteInesistente();
			throw ecc;
		}
		return studenti.get(matricola);
	}
	
}
