package SerializationDeserialization_FileHandling;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Serialization 
{
	public static void main(String []args) throws IOException
	{
		var fos = new FileOutputStream("C:\\Users\\DELL\\DESKTOP\\Emp.txt");
		var oos = new ObjectOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		
		try(sc; oos; fos)
		{
			System.out.print("How many objects you want to write ?");
			int noOfObjects = sc.nextInt();
			
			for(int i=1; i<=noOfObjects; i++)
			{
				Employee obj = Employee.getEmployeeObject();
				oos.writeObject(obj);
			}
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Object data stored in a file");
	 
	}

}
