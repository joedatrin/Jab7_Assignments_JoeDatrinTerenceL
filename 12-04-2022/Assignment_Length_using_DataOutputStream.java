package exercises_12_04_222;
import java.io.*;

public class Assignment_Length_using_DataOutputStream {
	public static void main(String[] args)
	{
	try
	{
		
	
		FileOutputStream FileOs =
				new FileOutputStream("Demo1.txt");
		
		DataOutputStream DataOs = 
				new DataOutputStream(FileOs);
		DataOs.writeBytes("My Name is Eric Clapton");
		
		int total_bytes = DataOs.size();
		System.out.println("Total Bytes written to the "
				+ "stream are : " + total_bytes);
		
		DataOs.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception : "+ e.toString());
	}
	}

}
