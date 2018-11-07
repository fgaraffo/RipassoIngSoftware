package ripasso;

public class Cicli {

	public static void main(String[] args) {
		
		// Cicli
		
		int i=0;
		
		while (i<10)
		{
			i = i+2;
			System.out.println(i);
		}
		
		int p = 0;
	
		while (p<10)
		{
			System.out.println(p);
			p = p+2;
		}
	
		for (int l=0; l<10; l=l+2)
		{
			System.out.println(l);
		}
	
		//scansione array
		
		int[] v = {10, 20, 30, 40, 50};
		
		for (int j=0; j<v.length; j++)
				System.out.println(v[j]);
	
	} 

}
