package inputoutput;

import java.io.*;

public class EsempioWriter {

	public static void main(String[] args) throws IOException {
		
		Writer w;
		w = new FileWriter("output.txt");
		
		w.write("Prima stringa su file");
		// se non chiudi non viene scritto
		// info vengono bufferizzate e scritte su disco a blocchi quando chiudi il file
		// oppure ogni volta che chiami flush() --> un log ad esempio, per non perdere le info
		w.flush(); 
		w.close();
		
	}

}
