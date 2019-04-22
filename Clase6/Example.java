//import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
public class Example{
	public static void main(String[] args) throws Exception{
		//FileWriter f = new FileWriter("fileJava.txt");
		FileReader f = new FileReader("fileJava.txt");
		//BufferedReader bf = new BufferedReader
		//(new InputStreamReader(System.in));
		BufferedReader bf = new BufferedReader(f);
		
		while(true){
			String linea = bf.readLine();
			if (linea == null) break;
			//f.write(linea+"\n");
			System.out.println(linea);
		}
		f.close();
	}
}