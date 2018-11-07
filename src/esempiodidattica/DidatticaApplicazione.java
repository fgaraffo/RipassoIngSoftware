package esempiodidattica;
import javax.swing.JOptionPane;


public class DidatticaApplicazione {

	public static void main(String[] args) {
		
		Corso c = new Corso("Ingegneria del Software", "AH55F");

		Studente s = new Studente (1234,"Mario","Rossi");
		
		c.iscrivi(s);
		
		Studente s2 = new Studente (4567,"Gianni","Verdi");
		
		c.iscrivi(s2);
		
		//System.out.println(c.iscritti[0].matricola+" "+c.iscritti[0].nome+" "+c.iscritti[0].cognome);
		
		c.stampaIscritti();
		
		//System.out.println(c.iscritti[0]);
		
		//s.setEta(35);
		
		// setter + controllo errore
		
		s.setEta(-1);
		
		System.out.println(s.getEta());
		
		
		int m=1;
		while (true) //oppure variabile flag 
		{
			String cognome = JOptionPane.showInputDialog("Inserisci cognome:");
			
			if (cognome==null)
				break; // se hai ancora istruzioni fuori ciclo
				//altrimenti RETURN
			String nome = JOptionPane.showInputDialog("Inserisci nome:");	
			if (nome==null)
				break;
			Studente s1 = new Studente (m, cognome, nome);
			
			c.iscrivi(s1);
			
			m++;
		}
		
		
	}

}
