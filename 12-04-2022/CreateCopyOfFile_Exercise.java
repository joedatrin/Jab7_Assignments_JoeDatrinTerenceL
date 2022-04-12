package exercises_12_04_222;

import java.io.*;

public class CreateCopyOfFile_Exercise {
	   public static void main(String[] args) {
	        byte[] array=new byte[50];
	        try {
	            FileInputStream sourceFile=new FileInputStream("test.txt");
	            FileOutputStream destFile=new FileOutputStream("newFIle.txt");
	            sourceFile.read(array);
	            destFile.write(array);
	            sourceFile.close();
	            destFile.close();
	            
	        }
	        catch (Exception e) {
	            e.getStackTrace();
	        }
	        }

}
