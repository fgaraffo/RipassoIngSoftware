package collezionijava;

import java.util.Comparator;

public class ComparatoreDiStudente implements Comparator <Studente> {

	public int compare (Studente s1, Studente s2)
	{
		// per decrescente basta aggiungere un meno davanti
		return s1.getMatricola().compareTo(s2.getMatricola());
	}
	
}
