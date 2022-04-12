package exercises_12_04_222;
import java.io.*;

public class Assignment_CopyOfFile {
	public static void main(String[] args)
	{
		byte[] array = new byte[50];
		try
		{
			FileInputStream srcFile = 
					new FileInputStream("test.txt");
			FileOutputStream dstFile = 
					new FileOutputStream("copy.txt");
			srcFile.read(array);
			dstFile.write(array);
			srcFile.close();
			dstFile.close();
			
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
