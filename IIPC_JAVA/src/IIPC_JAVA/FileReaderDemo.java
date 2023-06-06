package IIPC_JAVA;
import java.io.*;

public class FileReaderDemo {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Dhruvik\\git\\IIPC_Java\\IIPC_JAVA\\src\\IIPC_JAVA\\Text.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
			
		}
		fr.close();
		br.close();
	}
}
