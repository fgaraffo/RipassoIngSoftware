package collezione;

public class CollezioneApplicazione {

	public static void main(String[] args) {
		
		Collezione coll = new CollezioneLista();
		
		coll.aggiungi("Stringa"); // String estende Object
		coll.aggiungi(new Integer(3)); // Integer estende Object
		//coll.aggiungi(4.5); // AUTOBOXING: conversione in corrisp. tipo wrapper

		System.out.println("Dimensione: "+coll.dimensione());
		
	}

}
