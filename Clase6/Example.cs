using System.IO;
public class Example{
	public static void Main(){
		//FileStream fs = new FileStream("file.txt",
		//FileMode.Append,FileAccess.Write);
		FileStream fs = new FileStream("file.txt",
		FileMode.Open,FileAccess.Read);
		//StreamWriter sw = new StreamWriter(fs);
		StreamReader sr = new StreamReader(fs);
		while(true){
			//string linea = System.Console.ReadLine();
			string linea = sr.ReadLine();
			if(linea == null) break;
			//sw.WriteLine(linea);
			System.Console.WriteLine(linea);
		}
		//sw.Close();
		sr.Close();
		fs.Close();
	}
}