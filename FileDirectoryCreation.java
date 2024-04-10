package FileHandling;
import java.io.*;
public class FileDirectoryCreation {

	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\Niki.txt");	
		if(f.exists())
		{
			System.out.println("File existed");
		}
		else
		{
			System.out.println("File not exist...Creating new file");
		}
		if(f.mkdir())
		{
			System.out.println("File "+f.getName()+" Created");
		}
		else
		{
			System.out.println("File already existing");
		}

	}

}
