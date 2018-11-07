package collezionijava;

import java.util.Comparator;

public class Studente implements Comparable <Studente> {

	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		//super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	public String getMatricola()
	{
		return matricola;
	}
	
	
	public String toString()
	{
		return ""+nome+" "+cognome+" "+matricola;
	}
	
//	public boolean equals (Studente other) --> OVERLOAD
//	non andrebbe bene perchè il metodo contains chiama equals di Object
	public boolean equals (Object o) // OVERRIDE
	{
		Studente other = (Studente) o;
		return this.matricola.equals(other.matricola);
	}
	
	// compareTo dell'interfaccia Comparable
	//restituisce un intero: minore/uguale/maggiore
	/** <0 se this < altro
	 *  =0 se this = altro
	 *  >0 se this < altro
	 */
	public int compareTo (Studente altro)
	{
		//return this.cognome.compareTo(altro.cognome);
		int cfrCognomi = this.cognome.compareTo(altro.cognome);
				
		if (cfrCognomi != 0)
			return cfrCognomi;
		else
		{
			int cfrNomi = this.nome.compareTo(altro.nome);
			return cfrNomi;
		}		
	
		
	
	}
	
	// CLASSE ANNIDATA
	static public class Comparatore implements Comparator <Studente>
	{

		public int compare (Studente s1, Studente s2)
		{
			// per decrescente basta aggiungere un meno davanti
			// se annidata non serve più il get()
			return s1.matricola.compareTo(s2.matricola);
		}
	}
}
