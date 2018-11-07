package prova;

import java.io.*;

public class prova {

	
	public static void main(String[] args) throws IOException {
	
		
		Reader r = new FileReader("prova.txt");
		Reader br = new BufferedReader (r);
		
	    char [] caratteri = new char[5];
		int iterazione = 0;
		int n;
	
		while ((n = br.read(caratteri))!=-1)
		{
		    for (int i=0;i<n;i++)
		    {
		     System.out.print(caratteri[i]);	
		     //System.out.println(iterazione);
		     //iterazione++;
		     
		    }
		    	
		    	
			//System.out.print(caratteri);	
	    }
		
		r.close();
		br.close();
	}
}
