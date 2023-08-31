import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception
	{
		int i;
		FileReader fr=new FileReader("D:/tcs-demo.txt");
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
