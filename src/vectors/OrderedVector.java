package vectors;

public class OrderedVector extends Vector {

	public void add(int value)
	{
		//1) cerco il primo valore maggiore di value
		int i=0;
		for (i=0;i<num;i++)
		{
			if (vect[i]>value)
				break;
		}
		// i è l'indice del primo valore maggiore di value
		int j;
		for (j=num;j>i;j--)
		{
			vect[j] = vect[j-1];
		}
			
		// inserisco value e incremento il numero di elementi
		vect[i]=value;
		num++;
				
	}
	public void print()
	{
		System.out.println("Stampa l'array ordinato:");
		
		for (int i=0;i<num;i++)
			System.out.println(vect[i]);
		num++;
	}
	
	
	
}
