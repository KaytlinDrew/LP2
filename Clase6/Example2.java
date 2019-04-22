import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Example2{
	public static void main(String[] args) throws Exception{
		FileWriter f = new FileWriter("fileJava2.txt");
		
		BufferedReader bf = new BufferedReader
		(new InputStreamReader(System.in));
		
		
		while(true){
			String linea = bf.readLine();
			if (linea == null) break;
			f.write(linea+"\n");
			
		}
		f.close();
	}
}