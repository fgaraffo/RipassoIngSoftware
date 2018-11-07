package vectors;

public class Vector {

	int vect[];
	int num;
	
	public Vector()
	{
		num=0;
		vect=new int[100];
	}
	
	public void add (int value)
	{
		vect[num]=value;
		num++;
	}

	public void print()
	{
		System.out.println("Stampa l'array non ordinato:");
		/*for (int temp : vect)
		{
			if (temp!=0)
				System.out.println(temp);
		}
		*/
		for (int i=0;i<num;i++)
			System.out.println(vect[i]);
		num++;
	}
	
	
}
