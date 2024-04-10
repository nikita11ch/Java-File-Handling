package FileHandling;
import java.io.*;
public class WritingToFile {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout = new FileOutputStream("C:\\Users\\DELL\\DESKTOP\\Hyderabad.txt");
        try(fout)
         {
         String s = "Hyd is a popular IT City in India";
		 byte b[] = s.getBytes();

		 fout.write(b);

		 System.out.println("Success....");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
    }

}
