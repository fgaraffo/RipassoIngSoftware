package collezionijava;

import java.util.*;

public class EsempioLista {

	public static void main(String[] args) {
		
		List <String> l = new LinkedList<String>();
		
		l.add("Primo");
		l.add("Secondo");
		
		System.out.println(l.get(1));
		
		l.set(1, "2o");
		
		System.out.println(l.get(1));
		
		//l.set(2, "Terzo"); ERRATO, SET non aggiunge
		
		l.add(1, "1 e mezzo");
		System.out.println(l.get(2));
		
		System.out.println(l);
		
		List <Studente> studenti = new LinkedList <Studente>();
		
		Studente s = new Studente ("Mario", "Rossi", "s123");
		studenti.add(s);
		
		studenti.add(new Studente("Giuseppe","Verdi","s124"));
		System.out.println(studenti);
		
		Studente s2 = new Studente("Giuseppe","Verdi","s124");
		
//		if(studenti.toString().contains(s2.toString()))
//			System.out.println("Presente!");
		
		if(studenti.contains(s2))
			System.out.println("Presente!");
		else
			System.out.println("Assente!");
	
	
	}

}
