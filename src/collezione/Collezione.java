package collezione;

public interface Collezione {

	public abstract void aggiungi(Object nuovoElemento);
		
	public abstract int dimensione ();
		
	public abstract boolean contiene (Object elemento);
		
	public abstract String toString();
		
	
}
