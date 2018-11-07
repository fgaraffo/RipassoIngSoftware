package collezionijava;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class EsempioCollection {

	public static void main(String[] args) {
		
		Collection<String> c = new LinkedList <String> ();
		
		c.add("Mario");
		c.add("Giuseppe");
		
		// for each nome in C
		for(String nome : c){
			System.out.println("Nome: " + nome);
		}
		
		Iterator<String> it = c.iterator();
		String primo = it.next();
		String secondo = it.next();
		boolean ancora = it.hasNext();
		for(Iterator<String> i=c.iterator(); i.hasNext();){
			String e = i.next();
			//...
		}
		
		if(c.contains("Mario")){
			System.out.println("Mario è presente");
		}
		
//		int[] a = new int[10];
//		for(int e : a){
//			// ...
//		}
//		// EQUIVALE A
//		for(int i=0; i<a.length; ++i){
//			// ...
//			System.out.println("elemento #" + i + ":" + a[i]);
//		}
//		// EQUIVALE
//		int i=0;
//		while(i<a.length){
//			// ...
//			++i;
//		}
		
		
		
	}

}
