package exercises_12_04_222;

import java.io.File;

public class DeleteFile_Exercises {
	public static void main(String[] args)
	{
		  try {
	            File file=new File("test2.txt");
	            boolean value=file.delete();
	            if(value) {
	                System.out.println("File is deleted");
	            }
	            else {
	                System.out.println("File is not deleted");
	            }
	            
	        }
	        catch (Exception e) {
	            e.getStackTrace();
	        }
	}

}
