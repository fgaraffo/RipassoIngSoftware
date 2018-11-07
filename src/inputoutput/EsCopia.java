package inputoutput;

import java.io.*;

public class EsCopia {

	public static void main(String[] args) throws IOException {
		
		Reader in = new FileReader ("input.txt");
		Writer out = new FileWriter ("copy.txt");
		
		int carattere;
		while ((carattere = in.read()) != -1)
		{
			out.write(carattere);
		}

		in.close();
		out.close();
		
		
	}

}
