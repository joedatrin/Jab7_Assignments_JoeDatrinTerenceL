package exercises_12_04_222;
import java.io.*;

public class Assignment_FileSizes {
	public static void main(String[] args)
	{
		File file = new File("Demo.txt");
		
		if(file.exists())
		{
			double bytes = file.length();
			double kiloBytes = (bytes/1024);
			double megaBytes = (kiloBytes/1024);
			double gigaBytes = (megaBytes/1024);
			
			System.out.println("Bytes : "+bytes);
			System.out.println("KiloBytes : "+kiloBytes);
			System.out.println("MegaBytes : "+megaBytes);
			System.out.println("GigaBytes : "+gigaBytes);
		}
		else {
			System.out.println("File Does not Exits");
		}
	}

}
