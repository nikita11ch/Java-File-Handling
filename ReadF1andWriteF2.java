package FileHandling;
import java.io.*;
public class ReadF1andWriteF2 {

	public static void main(String[] args) throws IOException
	{
		var F1 = new FileInputStream("C:\\Users\\DELL\\DESKTOP\\F1.txt");
		var F2 = new FileOutputStream("C:\\Users\\DELL\\DESKTOP\\F2.txt");
		
		try(F1 ; F2 )
		{
			while(true)
			{
				int i = F1.read();
				if(i==-1)
				break;
				System.out.print((char)i);
				F2.write((byte)i);
			}			
			
		}
		catch(IOException i)
		{
			System.out.println("Exception handled");
		}
		
		
		
		

	}

}
