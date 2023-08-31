import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		File f=new File("D:/TCS Training/tcs-training.xls");
		f.createNewFile();
		FileWriter fw=new FileWriter("D:/TCS Training/Hands On/tcs-training.xls");
		fw.write("Testing....");
		fw.append("Content Added after the original Content");
		fw.close();
	}

}
