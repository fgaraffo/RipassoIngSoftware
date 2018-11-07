package ripasso;

public class Stringhe {

	public static void main(String[] args) {
		
		String [] array = new String [5];

		String s1 = new String ("Prima stringa!");
		String s2 = "Prima stringa!";
		
		array[0] = s1;
		array[1] = s2;
		
		//String [] array2 = {"aaa","bbb","ccc"};
		
		array[0] = s2;
		
		// confronto tra variabili riferimento
		if (s1 == s2)
			System.out.println("Le due stringhe sono uguali!");
		else
			System.out.println("Le due variabili riferimento sono diverse anche se il testo è uguale!");
		
		if (s1.equals(s2) == true) // confronto tra stringhe
			System.out.println("Le due stringhe sono uguali!");
		else
			System.out.println("Le due stringhe sono diverse!");
			
		String suno = "Hello";
		String sdue = "world!";
		
		String stre = suno + " " + sdue;
		int lunghezza = stre.length();
		
		System.out.println(stre);
		System.out.println("Lunghezza: "+lunghezza);
		
		stre += "\n"; // occupa un carattere
		// stre = stre + "\n";
		
		lunghezza = stre.length();
		System.out.println("Lunghezza: "+lunghezza);
		
		System.out.println("\"Ciao!\"");
		
		// oggetto stringa non è modificabile, crei un nuovo oggetto
		String a = "prima stringa"; // String a = new String ("prima stringa");
		a = "prima stringa modificata"; // a = new String ("prima stringa modificata");
			
		System.out.println(""+stre.charAt(0));

		System.out.println(""+stre.contains("lo")); // case sensitive
		
		System.out.println(""+stre.startsWith("lo")); // case sensitive
		
		System.out.println(""+stre.startsWith("He")); // case sensitive

		System.out.println(""+stre.toUpperCase());
		
		System.out.println(""+stre.indexOf("world")); // ricerca + indice
		
		if (stre.indexOf("!") !=-1)
			System.out.println("Carattere presente in posizione " + stre.indexOf("!"));
		else
			System.out.println("Carattere assente");
		
		String x = new String ("ABC");
		String y = new String ("abc");
		
		if (x==y) // Confronto errato
			System.out.println("UGUALI");
		else
			System.out.println("DIVERSE");
		
		if (x.equals(y) == true) // Confronto corretto
			System.out.println("EQUALS: CONTENUTO UGUALE");
		else
			System.out.println("EQUALS: CONTENUTO DIVERSO");
		
		if (x.compareTo(y) == 0) // case sensitive, ordine alfabetico
			System.out.println("compareTo: x UGUALE y");
		else if (x.compareTo(y) < 0)
			System.out.println("compareTo: x precede y");
		else
			System.out.println("x SEGUE y");
	
	
	}

}
