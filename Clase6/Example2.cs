using System.IO;
public class Example{
	public static void Main(){
		FileStream fs = new FileStream("file2.txt",
		FileMode.Append,FileAccess.Write);
		StreamWriter sw = new StreamWriter(fs);
		
		while(true){
			string linea = System.Console.ReadLine();
			if(linea == null) break;
			sw.WriteLine(linea);
		}
		sw.Close();
		fs.Close();
	}
}