package collezione;

public class CollezioneLista implements Collezione{

	private ElementoLista head = null;
	private int length = 0;
	
	public void aggiungi(Object nuovoElemento)
	{
		head = new ElementoLista(nuovoElemento, head);
		length++;
	}
	
	public int dimensione()
	{
		return length;
	}

	public String toString()
	{
		ElementoLista elementoCorrente = head;
		String risultato = "";
		while (elementoCorrente != null)
		{
			risultato += elementoCorrente.getValore().toString()+"\n";
			elementoCorrente = elementoCorrente.getNext();
		}
			
		return risultato;
	}

	public boolean contiene(Object elemento)
	{
		ElementoLista elementoCorrente = head;
		
		while (elementoCorrente != null)
		{
			//Object valore = elementoCorrente.getValore();
			//if(valore.equals(elemento))
			
			if(elementoCorrente.getValore().equals(elemento))
				return true;
			else
				elementoCorrente=elementoCorrente.getNext();
		}
		
		return false;
	}
	
	
}
