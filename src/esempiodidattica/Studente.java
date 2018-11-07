package esempiodidattica;

public class Studente {

	private int matricola;
	private String nome;
	private String cognome;
	private int eta;
	private boolean sesso;
	
	public Studente (int m, String n, String c)
	{
		matricola = m;
		nome = n;
		cognome = c;
		eta = 21;
	}
	public Studente (int eta, boolean s)
	{
		this.eta = eta;
		sesso = s;
		matricola = 9999;
		nome = "";
		cognome = "";
		
	}
	// METODI GETTER, to get
	public int getMatricola() 
	{
		return matricola;		
	}
	public String getNome() 
	{
		return nome;		
	}
	public String getCognome() 
	{
		return cognome;		
	}
	public int getEta() 
	{
		return eta;		
	}
	// METODI SETTER, to set
	public void setEta(int nuovaEta) 
	{
		if (nuovaEta>0)
			eta=nuovaEta;
		else
			System.out.println("Eta' impostata minore o uguale a zero");
	}
	public String stringa () 
	{
		return matricola + " "+nome+" "+cognome+" "+eta+" "+sesso;
	}
	
}
