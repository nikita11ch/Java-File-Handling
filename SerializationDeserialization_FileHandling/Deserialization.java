package SerializationDeserialization_FileHandling;
import java.io.*;
public class Deserialization 
{
	public static void main(String []args) throws IOException
	{
		var f = new FileInputStream("C:\\Users\\DELL\\DESKTOP\\Emp.txt");
		var s = new ObjectInputStream(f);
		
		try(f ; s)
		{
			System.out.println(s.readObject());
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}
	

}
