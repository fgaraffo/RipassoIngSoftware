package companyapp;
// classe nel default package

import esempiocompany.*;
import collezione.*;

public class CompanyApplication {

	public static void main(String[] args) {
		
		Employee e = new Employee("Mario Rossi", 20000);
		e.incrementWage();
		
		Manager m = new Manager("Verdi Gianni", 1000000, "FIAT");
		
		//Manager managers[] = new Manager[10];
		
		Employee employees[] = new Employee[1000];
		
		employees[0]=e;
		employees[1]=m;
		
		/*for (int i=0;i<employees.length;i++)
		{
			if (employees[i]!=null)
				employees[i].incrementWage();
		}

		System.out.println(""+employees[0].name+" "+employees[0].wage );
		System.out.println(""+employees[1].name+" "+employees[1].wage );
		 */
		System.out.println(""+employees[0].name+" "+employees[0].wage );
		System.out.println(""+employees[1].name+" "+employees[1].wage );
		
		// DYNAMIC BINDING
		for (Employee temp : employees)
		{
			if (temp!=null)
				temp.incrementWage();
		}
	
		System.out.println(""+employees[0].name+" "+employees[0].wage );
		System.out.println(""+employees[1].name+" "+employees[1].wage );
	
		// il metodo toString() della classe Object è un'implementazione generale
		// quindi non può restituire nome e paga
		// restituisce l'identificatore univoco dell'oggetto in memoria
		
		Employee ea = new Employee("M. Rossi", 5000);
		String s = ea.toString();
		System.out.println(s);
		
		Object eb = new Employee("G. Verdi", 6000);
		String s1 = eb.toString();
		System.out.println(s1);
		
		Employee ed = new Employee("M. Rossi", 5000);
		System.out.println(ed.toString());
		
		Employee ec = new Employee("F. Neri", 7000); // funziona anche senza invocare direttamente il metodo
		System.out.println(ec);
		
		if (ea == ed) // il confronto tra variabili riferimento non vede il contenuto
			System.out.println("Stesso oggetto!");
		else
			System.out.println("Oggetti diversi!");
		
		// METODO EQUALS
		if (ea.equals(ed)) // chiama il metodo equals di object che è generale (non è quello di String ad esempio)
			System.out.println("Oggetti uguali!");
		else
			System.out.println("Oggetti non uguali!");
		
		Collezione c = new CollezioneLista();
		
		Employee em = new Employee("G. Verdi", 1000);
		c.aggiungi(em);
		
		System.out.println("Dimensione: "+c.dimensione());
		
		Manager ma = new Manager ("Nome", 5000, "Logistica");
		c.aggiungi(ma);
		
		System.out.println("Dimensione: "+c.dimensione());
		
		Manager ma2 = new Manager ("Nome", 5000, "Logistica");
		
		if (c.contiene(ma2))
			System.out.println("Presente");
		else
			System.out.println("Assente");

		System.out.println("Contenuto: \n" + c.toString());
	
		//Collezione coll = (Collezione) new CollezioneLista();
		Collezione coll = new CollezioneLista();
		
		
		
	}

}
