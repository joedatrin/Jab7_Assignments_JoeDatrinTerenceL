package exercises_12_04_222;
import java.io.*;
public class Assignment_ReadFileLinebyLine {
	public static void main(String[] args)
	{
		char[] array = new char[100];
		try {
			FileReader file = new FileReader("Demo.txt");
			BufferedReader br = new BufferedReader(file);
			
			br.read(array);
			System.out.println("Data in the file : ");
			System.out.println(array);
			br.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
