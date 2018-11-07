package ripasso;

public class Classi {

	public static void main(String[] args) {
		
		int[] matricole = {123, 456, 789};
		String[] cognomi = {"Rossi","Bianchi","Verdi"};
		String[] nomi = {"Mario","Roberto","Gianni"};
		
		for (int i=0;i<3;i++) 
		{
			System.out.println("Studente: "+matricole[i]+" "+cognomi[i]+" "+nomi[i]);
		}
		
	//viene allocata area di memoria, il nome collega la variabile all'area di memoria
	//reference (a differenza della variabile che contiene il dato)	
		
		Studente s1 = new Studente();
		Studente s2 = new Studente();
		Studente s3 = new Studente();
		
		s1.matricola=123;
		s1.cognome="Rossi";
		s1.nome="Mario";
		
		s2.matricola=456;
		s2.cognome="Bianchi";
		s2.nome="Roberto";
		
		s3.matricola=123;
		s3.cognome="Verdi";
		s3.nome="Gianni";
	
		System.out.println("Studente: "+s1.matricola+" "+s1.cognome+" "+s1.nome);
		
		Studente[] studenti = {s1, s2, s3};
		
		for (int i=0;i<3;i++) 
		{
			System.out.println("Studente: "+studenti[i].matricola+" "+studenti[i].cognome+" "+studenti[i].nome);
		}
	
	double d = 3.0;
	
	int intero = 0;
	
	System.out.println(d+""+intero);
	//intero = d; errore type mismatch
	
	
	Studente e = new Studente();
	
	System.out.println(e);
		
		
	}

	static class Studente {
	
		int matricola;
		String nome;
		String cognome;
		
		
		
	}
	
	
	
	
}
