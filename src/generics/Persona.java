package generics;

public class Persona <T> {

	private String nome;
	private String cognome;
	private T identificatore;
	
	public Persona(String n, String c, T id)
	{
		this.nome = n;
		this.cognome = c;
		this.identificatore = id;
	}

	public T getID()
	{
		return identificatore;
	}

}
