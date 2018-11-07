package generics;

/**applicazione dell'esempio su svantaggi nell'uso di classe Object**/

public class EsempioApplicazione {

	public static void main(String[] args) {

		Persona <Integer> p = new Persona <Integer> ("Mario", "Rossi", new Integer(10));
		
		Persona <String> q = new Persona <String> ("Giuseppe", "Verdi", "GPPVDI");
		
		String id = q.getID();
		
		//String id1 = p.getID().toString();
		Integer id1 = p.getID();
		
		System.out.println(id+" "+id1);

	}

}
