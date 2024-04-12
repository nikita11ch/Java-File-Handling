package FileHandling;
import java.io.*;
public class ReadingFromFile {

	public static void main(String[] args) throws IOException
	{
		var fin = new FileInputStream("C:\\Users\\DELL\\DESKTOP\\Hyderabad.txt");

		 try(fin)
		 {
			 int i = 0;
            while(true)
			 {
				 i = fin.read();
				 if(i==-1)
					 break;
				 System.out.print((char)i);
			 }

		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println();
   
		
		
		
	}

}
