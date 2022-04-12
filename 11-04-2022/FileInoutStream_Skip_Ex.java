package exercises_11_04_2022;

import java.io.FileInputStream;

public class FileInoutStream_Skip_Ex {
	public static void main(String[] args) {
		try {
		FileInputStream input=new FileInputStream("test1.txt");// The file is stored outside the src folder
		//System.out.print(input.available());
		// Read
		input.skip(7);
		int i=input.read();
		while(i!=-1) {
		System.out.print((char) i);
		i=input.read();
		}
		input.close();
		}
		catch (Exception e) {
		e.getStackTrace();
		}
		}

}
