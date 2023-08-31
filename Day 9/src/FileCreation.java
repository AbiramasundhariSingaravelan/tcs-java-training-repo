import java.io.File;

public class FileCreation {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		File f=new File("D:/TCS Training/Hands On/tcs-training.xls");
		if(f.createNewFile())
		{
			System.out.println("File is created with the name: "+f.getName());
		}
		else
		{
			System.out.println("Unable to create a file");
		}
		if(f.exists())
		{
			System.out.println("Name of the File: "+f.getName());
			System.out.println("Absolute Path of the file: "+f.getAbsolutePath());
			System.out.println("Is Readable: "+f.canRead());
			System.out.println("Is Writeable: "+f.canWrite());
			System.out.println("Size of the file: "+f.length());
		}
		else
		{
			System.out.println("The file doesn't exists");
		}
		if(f.delete())
		{
			System.out.println("The file is deleted");
		}
		else
		{
			System.out.println("The file is not deleted");
		}
	}

}
