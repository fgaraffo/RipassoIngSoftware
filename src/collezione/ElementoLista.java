package collezione;

public class ElementoLista {

	private Object valore;
	private ElementoLista next;
	
	public ElementoLista(Object valore, ElementoLista next)
	{
		super();
		this.valore = valore;
		this.next = next;
	}

	public Object getValore()
	{
		return valore;
	}

	public ElementoLista getNext() 
	{
		return next;
	}

		
	
}
