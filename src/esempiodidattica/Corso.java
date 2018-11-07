package esempiodidattica;

public class Corso {

	private String titolo;
	private String codice;	
	public Studente iscritti[]; // riferimento in memoria
	final static int MAX = 100;
	
	
	public Corso ()
	{
		titolo = "";
		codice = new String("");
		iscritti= new Studente[MAX]; // valori null
	}
	
	public Corso (String t, String c)
	{
		titolo = t;
		codice = c;
		iscritti= new Studente[MAX]; //punti iscritti alla memoria
		
	}
	
	public void iscrivi (Studente s) 
	{
		for(int i =0;i<iscritti.length;i++)
		{
			if (iscritti[i]==null) 
			{
				iscritti [i]=s;
			
				break; //return;//variabile flag
			}
			
		}
	}	
		public void stampaIscritti() 
		{
			String risultato="";
			
		/*	for (int p=0; p<iscritti.length;p++)
			{
				Studente stemp = iscritti[p];
				if (stemp!=null)
				{
				risultato=""+stemp.matricola+" "+stemp.nome+" "+stemp.cognome;
				System.out.println(risultato);
				}
			}*/
			
			//for each, eviti il contatore se non serve l'indice
			for (Studente stemp : iscritti)
				if (stemp!=null)
				{
					//risultato=""+stemp.getMatricola()+" "+stemp.getNome()+" "+stemp.getCognome();
					//System.out.println(risultato);
					System.out.println(stemp.stringa());
				}
			
			
		}
		
		
	}
	


