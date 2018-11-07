package ripasso;

public class Metodi {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		a=1; b=5; c=9;
		// parametri locali
		int media = media(a,b,c);
		
		System.out.println(media);
		
		int[] v = {1, 5, 9};
		
		media = mediaarray(v);

		System.out.println(media);
		}
			//||||||||firma del metodo ||||||||||||||||
	static int media(int primo, int secondo, int terzo)
	{
		// primo, secondo, terzo sono parametri formali
		int risultato = (primo + secondo + terzo)/3;
		
		return (risultato);
	}
	
	// 2 metodi possono avere lo stesso nome ma non la stessa firma
	// intesa come tipo, non il nome
	// overloading
	static int mediaarray(int[] array)
	{
		int i;
		int somma=0;
		int risultato;
		
		for (i=0; i<array.length; i++)
			somma+=array[i]; //somma=somma+array[i]
	
		risultato = somma / array.length ;
		
		return risultato;
	
	}
	
	
	
}
