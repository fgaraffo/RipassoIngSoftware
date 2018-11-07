package ripasso;

public class Reference {

	public static void main(String[] args) {
		
		//perchè parentesi tonde? new Studente() --> COSTRUTTORE
		
		Studente s1 = new Studente();
			
		Studente s2 = new Studente();
		
		s1.cognome = "Rossi";
		
		s2.cognome = "Bianchi";
		
		//aliasing = puntano a stessa area di memoria
		//hai più di una variabile riferimento che puntano alla stex area
		s2=s1;	
		
		System.out.println(" "+s1.cognome);
		System.out.println(" "+s2.cognome);
		
		
		}
		
		
	static class Studente {
		
		int matricola;
		String nome;
		String cognome;
		
		public void metodo () {}
		
		//costruttore: metodo di inizializzazione
		Studente () {
			
			matricola = 0;
			cognome = "";
			nome = "";
			
			}
		
		
	}

}
